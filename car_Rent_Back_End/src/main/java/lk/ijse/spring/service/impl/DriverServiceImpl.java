package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
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
 * @author : Jayani_Arunika  10/29/2023 - 4:16 PM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        Driver driver = new Driver(dto.getUserID(),dto.getName(),dto.getAddress(), dto.getContactNo(), dto.getLicenseNo(), dto.getEmail(), dto.getNic(),"",dto.getDriverAvailability(), new User(dto.getUser().getUserID(),dto.getUser().getUserName(),dto.getUser().getPassword(),dto.getUser().getRole()));
        System.out.println(driver);
        if (repo.existsById(dto.getUserID()))
            throw new RuntimeException("Driver Already Exist. Please enter another id..!");
        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getLicenseImg().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getLicenseImg().getOriginalFilename()));

            driver.setLicense_Img("uploads/" + dto.getLicenseImg().getOriginalFilename());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

        repo.save(driver);
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        Driver driver = new Driver(dto.getUserID(), dto.getName(), dto.getContactNo(), dto.getAddress(), dto.getEmail(), dto.getNic(), dto.getLicenseNo(), "", dto.getDriverAvailability(), new User(dto.getUser().getUserID(), dto.getUser().getRole(), dto.getUser().getUserName(), dto.getUser().getPassword()));
        System.out.println(driver);
        if (!repo.existsById(dto.getUserID())) {
            throw new RuntimeException("Driver Not Exist. Please enter Valid id..!");
        }

        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getLicenseImg().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getLicenseImg().getOriginalFilename()));

            driver.setLicense_Img("uploads/" + dto.getLicenseImg().getOriginalFilename());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver);
        repo.save(driver);

    }

    @Override
    public void deleteDriver(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(id);

    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<Driver>>() {
        }.getType());
    }


    @Override
    public CustomDTO userIdGenerate() {
        return new CustomDTO(repo.getLastIndex());
    }
}

