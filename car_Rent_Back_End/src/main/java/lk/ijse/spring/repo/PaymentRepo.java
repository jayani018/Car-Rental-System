package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:12 PM
 * @since : v0.01.0
 **/

public interface PaymentRepo extends JpaRepository<Payment,String> {
    @Query(value = "SELECT paymentID FROM Payment ORDER BY paymentID DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();
}
