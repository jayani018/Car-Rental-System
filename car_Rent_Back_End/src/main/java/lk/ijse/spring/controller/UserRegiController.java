package lk.ijse.spring.controller;

import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.dto.UserRegiDTO;
import lk.ijse.spring.entity.UserRegi;
import lk.ijse.spring.service.UserRegiService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:08 AM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/regUser")
public class UserRegiController {

    @Autowired
    private UserRegiService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveUser(@RequestBody UserRegiDTO dto){
        service.saveUser(dto);
        System.out.println(dto);
        return new ResponseUtil("Ok","Sucessfully Registered..",null);
    }

    @PutMapping
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateUser(@RequestBody UserRegiDTO dto){
        service.updateUser(dto);
        return new ResponseUtil("Ok","Successfully Updated. :"+dto.getUserId(),null);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteUser(@RequestParam String id){
        service.deleteUser(id);
        return new ResponseUtil("OK","Successfully Deleted. :"+id ,null );
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public ResponseUtil getAllUser(){
        return new ResponseUtil("OK", "Successfully Loaded. :",service.getAllUser());
    }
}