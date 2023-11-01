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
        if (repo.existsById(dto.getUserId())){
            throw new RuntimeException("User Already Exist. Please Enter another id..");
        }
//        repo.save(mapper.map(dto, UserRegi.class));
        repo.save(mapper.map(dto,User.class));
    }

    @Override
    public void updateUser(UserRegiDTO dto) {
        if (!repo.existsById(dto.getUserId())){
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
