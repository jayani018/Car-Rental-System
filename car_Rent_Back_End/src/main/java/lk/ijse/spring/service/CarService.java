package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:45 PM
 * @since : v0.01.0
 **/

public interface CarService {
    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String id);
    ArrayList<CarDTO> getAllCar();
}
