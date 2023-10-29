package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.UserRegiDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 3:14 PM
 * @since : v0.01.0
 **/

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String id);
    ArrayList<AdminDTO> getAllAdmin();
}
