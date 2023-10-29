package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.dto.UserRegiDTO;
import lk.ijse.spring.entity.UserRegi;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:25 AM
 * @since : v0.01.0
 **/

public interface UserRegiService {
    void saveUser(UserRegiDTO dto);
    void updateUser(UserRegiDTO dto);
    void deleteUser(String dto);
}
