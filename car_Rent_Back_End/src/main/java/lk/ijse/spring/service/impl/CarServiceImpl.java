package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.CachedRowSet;
import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:45 PM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveCar(CarDTO dto) {

    }

    @Override
    public void updateCar(CarDTO dto) {

    }

    @Override
    public void deleteCar(String id) {

    }

    @Override
    public ArrayList<CarDTO> getAllCar() {
        return null;
    }
}
