package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:13 PM
 * @since : v0.01.0
 **/

public interface RentRepo extends JpaRepository<Rent,String> {
    @Query(value = "SELECT rentID FROM Rent ORDER BY rentID DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(rentID) FROM Rent", nativeQuery = true)
    int getSumOfBooking();

    @Query(value = "SELECT COUNT(rentID) FROM Rent WHERE rentType='PENDING'", nativeQuery = true)
    int getSumOfBookingPending();

    @Query(value = "SELECT COUNT(rentID) FROM Rent WHERE rentType='CONFORM' or rentType='PAY'", nativeQuery = true)
    int getSumOfBookingActive();
}
