package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserRegiDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 3:14 PM
 * @since : v0.01.0
 **/

public interface AdminService {
    void saveAdmin(UserRegiDTO dto);
    void updateAdmin(UserRegiDTO dto);
    void deleteAdmin(String id);
    ArrayList<UserRegiDTO> getAllAdmin();
}
