package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/30/2023 - 11:49 PM
 * @since : v0.01.0
 **/

public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);

}
