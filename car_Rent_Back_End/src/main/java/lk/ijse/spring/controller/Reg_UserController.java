package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.dto.Reg_UserDTO;
import lk.ijse.spring.embeded.Name;
import lk.ijse.spring.entity.Reg_User;
import lk.ijse.spring.service.Reg_UserService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:08 AM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/reg_User")
public class Reg_UserController {

    @Autowired
    private Reg_UserService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveUser(@ModelAttribute Reg_UserDTO regUserDTO, @ModelAttribute UserDTO user, @ModelAttribute Name name) {
        regUserDTO.setName(name);
        regUserDTO.setUser(user);
        System.out.println(regUserDTO);
        service.saveUser(regUserDTO);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/update")
    public ResponseUtil updateUser(@ModelAttribute Reg_UserDTO regUserDTO, @ModelAttribute UserDTO user, @ModelAttribute Name name) {
        regUserDTO.setName(name);
        regUserDTO.setUser(user);
        System.out.println(user);
        System.out.println(name);
        System.out.println(regUserDTO);
        service.updateUser(regUserDTO);

        return new ResponseUtil("OK", "Successfully Updated. :" + regUserDTO.getUser_Id(), null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteUser(@RequestParam String id) {
        service.deleteUser(id);
        return new ResponseUtil("OK", "Successfully Deleted. :" + id, null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/loadAllUsers")
    public ResponseUtil getAllUser() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllUser());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/reg_UserIdGenerate")
    public @ResponseBody
    CustomDTO userIdGenerate() {
        return service.userIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/searchCustomer", params = {"cus_Id"})
    public Reg_User searchDriverId(String cus_Id) {
        return service.searchUserId(cus_Id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/customerCount")
    public @ResponseBody CustomDTO getSumUser() {
        return service.getSumUser();
    }


}
