package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:16 PM
 * @since : v0.01.0
 **/

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String id);
    ArrayList<DriverDTO> getAllDriver();
    CustomDTO userIdGenerate();
}
