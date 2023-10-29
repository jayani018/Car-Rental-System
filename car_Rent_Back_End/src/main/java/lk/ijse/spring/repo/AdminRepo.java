package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jayani_Arunika  10/29/2023 - 3:21 PM
 * @since : v0.01.0
 **/

public interface AdminRepo extends JpaRepository<Admin,String> {
}
