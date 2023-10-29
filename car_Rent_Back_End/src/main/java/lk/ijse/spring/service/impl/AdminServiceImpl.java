package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.UserRegiDTO;
import lk.ijse.spring.service.AdminService;
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
    @Override
    public void saveAdmin(UserRegiDTO dto) {

    }

    @Override
    public void updateAdmin(UserRegiDTO dto) {

    }

    @Override
    public void deleteAdmin(String id) {

    }

    @Override
    public ArrayList<UserRegiDTO> getAllAdmin() {
        return null;
    }
}
