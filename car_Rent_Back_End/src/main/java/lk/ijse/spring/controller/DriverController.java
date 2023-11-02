package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 4:35 PM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveDriver(@RequestBody DriverDTO dto) {
        service.saveDriver(dto);
        System.out.println(dto);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }
    @PutMapping
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto) {
        service.updateDriver(dto);
        return new ResponseUtil("OK", "Successfully Updated. :" + dto.getUserID(), null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteAdmin(@RequestParam String id) {
        service.deleteDriver(id);
        return new ResponseUtil("OK", "Successfully Deleted. :" +id, null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/loadAllDrivers")
    public ResponseUtil getAllDriver() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllDriver());
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/driverIdGenerate")
    public @ResponseBody CustomDTO customerIdGenerate() {
        return service.userIdGenerate();
    }
}
