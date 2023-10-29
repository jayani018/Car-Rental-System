package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 3:42 PM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveAdmin(@RequestBody AdminDTO dto){
        service.saveAdmin(dto);
        System.out.println(dto);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }
    @PutMapping
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateAdmin(@RequestBody AdminDTO dto){
        service.updateAdmin(dto);
        return new ResponseUtil("OK", "Successfully Updated. :" + dto.getAdminId(), null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteAdmin(@RequestParam String id) {
        service.deleteAdmin(id);
        return new ResponseUtil("OK", "Successfully Deleted. :" + id, null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public ResponseUtil getAllAdmin() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllAdmin());
    }

}
