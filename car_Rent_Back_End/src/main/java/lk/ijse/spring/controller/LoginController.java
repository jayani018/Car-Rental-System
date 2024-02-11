package lk.ijse.spring.controller;

import lk.ijse.spring.service.UserService;
import lk.ijse.spring.util.CurrentUser;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/31/2023 - 12:05 AM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/loginForm")
public class LoginController {
    @Autowired
    private UserService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllRegUser(){
        System.out.println(service.getAllRegUsers());
        return new ResponseUtil("OK","Successfully Loaded..!",service.getAllRegUsers());
    }

    @GetMapping(params = {"username"})
    public ResponseUtil setUser(String username,String password){
        CurrentUser.currentUser=service.getRegUsers(username,password);
        return new ResponseUtil("OK","Successfully Loaded..!","");
    }

    @GetMapping(path = "current")
    public ResponseUtil getCurrentUser(){
        return new ResponseUtil("OK","Successfully Loaded..!",CurrentUser.currentUser);
    }


}
