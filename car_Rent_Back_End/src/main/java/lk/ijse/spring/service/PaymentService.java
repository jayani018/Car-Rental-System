package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.PaymentDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:15 PM
 * @since : v0.01.0
 **/

public interface PaymentService {
    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto, String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
