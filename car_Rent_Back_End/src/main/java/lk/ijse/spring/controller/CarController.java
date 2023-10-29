package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 5:02 PM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCar(@RequestBody CarDTO dto) {
        service.saveCar(dto);
        System.out.println(dto);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }
    @PutMapping
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        service.updateCar(dto);
        return new ResponseUtil("OK", "Successfully Updated. :" + dto.getCarId(),
                null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCar(@RequestBody String id){
        service.deleteCar(id);
        return  new ResponseUtil("OK", "Successfully Deleted. :"+id,
                null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public ResponseUtil getAllCar(){
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllCar());
    }
}
