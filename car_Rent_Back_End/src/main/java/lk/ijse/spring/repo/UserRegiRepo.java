package lk.ijse.spring.repo;

import lk.ijse.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:01 AM
 * @since : v0.01.0
 **/

public interface UserRegiRepo extends JpaRepository<User,String> {
}
