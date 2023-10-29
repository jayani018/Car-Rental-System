package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:14 PM
 * @since : v0.01.0
 **/

public interface DriverRepo extends JpaRepository<Driver,String> {
}
