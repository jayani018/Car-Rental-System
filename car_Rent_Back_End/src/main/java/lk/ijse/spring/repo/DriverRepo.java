package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:14 PM
 * @since : v0.01.0
 **/

public interface DriverRepo extends JpaRepository<Driver,String> {
    @Query(value = "SELECT user_Id FROM Driver ORDER BY user_Id DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver", nativeQuery = true)
    int getSumDriver();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver WHERE driverAvailability='AVAILABLE'", nativeQuery = true)
    int getSumAvailableDriver();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver WHERE driverAvailability='UNAVAILABLE'", nativeQuery = true)
    int getSumUnavailableDriver();



    @Query(value = "SELECT * FROM Driver WHERE driverAvailability='AVAILABLE'", nativeQuery = true)
    List<Driver> availableDrivers();
}
