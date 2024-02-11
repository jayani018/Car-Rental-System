package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.service.PaymentService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:20 PM
 * @since : v0.01.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/paymentIdGenerate")
    public @ResponseBody
    CustomDTO customerIdGenerate() {
        return service.paymentIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil savePayment(@RequestBody PaymentDTO dto, @RequestParam String rentID) {
        System.out.println(dto);
        System.out.println(rentID);
        service.savePayment(dto, rentID);
        return new ResponseUtil("OK", "Successfully Payment.!", null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public ResponseUtil getAllPayment() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllPayment());

    }
}
