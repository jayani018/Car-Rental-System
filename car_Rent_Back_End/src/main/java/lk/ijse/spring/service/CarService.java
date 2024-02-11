package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Car;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:45 PM
 * @since : v0.01.0
 **/

public interface CarService {
    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String car_Id);
    ArrayList<CarDTO> getAllCar();
    CustomDTO carIdGenerate();
    Car searchCarId(String id);
    CustomDTO getSumCar();
    CustomDTO getSumAvailableCar();
    CustomDTO getSumReservedCar();
    CustomDTO getSumMaintainCar();
    CustomDTO getSumUnderMaintainCar();
    ArrayList<CarDTO> getFilerData(String type,String fuelType);
    ArrayList<CarDTO> filterCarDetails(String name, String fuel_Type,String type, String transmission_Type);
}
