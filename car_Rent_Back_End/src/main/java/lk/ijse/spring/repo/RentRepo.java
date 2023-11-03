package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:13 PM
 * @since : v0.01.0
 **/

public interface RentRepo extends JpaRepository<Rent,String> {
}