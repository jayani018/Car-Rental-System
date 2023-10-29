package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:16 PM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Override
    public void saveDriver(DriverDTO dto) {

    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(String id) {

    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() {
        return null;
    }
}
