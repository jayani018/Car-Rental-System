package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 3:18 PM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getUser_Id())) {
            throw new RuntimeException("Admin Already Exist. Please enter another id..!");
        }
        repo.save(mapper.map(dto, Admin.class));
    }


    @Override
    public void updateAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getUser_Id())) {
            throw new RuntimeException("Admin Not Exist. Please enter Valid id..!");
        }
        repo.save(mapper.map(dto, Admin.class));
    }



    @Override
    public void deleteAdmin(String reg_ID) {
        if (!repo.existsById(reg_ID)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(reg_ID);
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin () {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<Admin>>() {
        }.getType());
    }
}
