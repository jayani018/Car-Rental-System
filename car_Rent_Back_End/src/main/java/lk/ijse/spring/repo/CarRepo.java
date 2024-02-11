package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:43 PM
 * @since : v0.01.0
 **/

public interface CarRepo extends JpaRepository<Car,String> {
    @Query(value = "SELECT car_Id FROM Car ORDER BY car_Id DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(car_Id) FROM Car", nativeQuery = true)
    int getSumCar();

    @Query(value = "SELECT COUNT(car_Id) FROM Car WHERE vehicleAvailabilityType='AVAILABLE';", nativeQuery = true)
    int getSumAvailableCar();

    @Query(value = "SELECT COUNT(car_Id) FROM Car WHERE vehicleAvailabilityType='UNAVAILABLE';", nativeQuery = true)
    int getSumReservedCar();

    @Query(value = "SELECT COUNT(car_Id) FROM Car WHERE vehicleAvailabilityType='MAINTAIN';", nativeQuery = true)
    int getSumMaintainCar();

    @Query(value = "SELECT COUNT(car_Id) FROM Car WHERE vehicleAvailabilityType='UNDER_MAINTAIN';", nativeQuery = true)
    int getSumUnderMaintainCar();

    @Query(value = "SELECT * FROM Car WHERE type =?1 and fuel_Type=?2 and vehicleAvailabilityType='AVAILABLE' ", nativeQuery = true)
    ArrayList<Car> filterCar(String type, String fuelType);

    @Query(value = "SELECT * FROM Car WHERE name=?1 or fuel_Type=?2 and CarType=?3 and transmission_Type=?4 and vehicleAvailabilityType='AVAILABLE'", nativeQuery = true)
    ArrayList filterCarDetails(String name, String fuel_type, String type, String transmission_type);
}
