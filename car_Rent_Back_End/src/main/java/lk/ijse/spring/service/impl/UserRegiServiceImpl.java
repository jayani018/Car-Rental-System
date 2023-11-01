package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.dto.UserRegiDTO;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.entity.UserRegi;
import lk.ijse.spring.repo.UserRegiRepo;

import lk.ijse.spring.service.UserRegiService;

import lombok.ToString;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:28 AM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class UserRegiServiceImpl implements UserRegiService {

    @Autowired
    private UserRegiRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveUser(UserRegiDTO dto) {
        UserRegi regUser = new UserRegi(dto.getUserID(), dto.getName(), dto.getContactNo(), dto.getAddress(), dto.getEmail(), dto.getNic(), dto.getLicenseNo(), "", "", new User(dto.getUser().getUserID(), dto.getUser().getRole(), dto.getUser().getUserName(), dto.getUser().getPassword()));
        if (repo.existsById(dto.getUserID()))
            throw new RuntimeException("User Already Exist. Please enter another id..!");

        try {

            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getNicImg().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getNicImg().getOriginalFilename()));
            dto.getLicenseImg().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getLicenseImg().getOriginalFilename()));

            regUser.setNicImg("uploads/" + dto.getNicImg().getOriginalFilename());
            regUser.setLicenseImg("uploads/" + dto.getLicenseImg().getOriginalFilename());


        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(regUser);
        repo.save(regUser);
    }

    @Override
    public void updateUser(UserRegiDTO dto) {
        if (!repo.existsById(dto.getUserID())){
            throw new RuntimeException("Customer Not Exist. Please Enter Valid id.." );
        }
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void deleteUser(String regId) {
        if (!repo.existsById(regId)){
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(regId);

    }

    @Override
    public ArrayList<UserRegiDTO> getAllUser() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<UserRegiDTO>>() {
        }.getType());
    }

    @Override
    public CustomDTO userIdGenerate() {
        return new CustomDTO(repo.getLastIndex());
    }

}
