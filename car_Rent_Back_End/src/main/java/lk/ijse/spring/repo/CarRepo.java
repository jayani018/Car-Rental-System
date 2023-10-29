package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:43 PM
 * @since : v0.01.0
 **/

public interface CarRepo extends JpaRepository<Car,String> {
}
