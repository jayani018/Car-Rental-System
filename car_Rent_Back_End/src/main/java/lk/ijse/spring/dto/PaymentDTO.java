package lk.ijse.spring.dto;

import lk.ijse.spring.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author : Jayani_Arunika  11/3/2023 - 4:02 PM
 * @since : v0.01.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class PaymentDTO {
    private String paymentID;
    private RentDTO rentID;
    private PaymentType paymentType;
    private LocalDate date;
    private LocalTime time;
    private Double lostDamage;
    private Double rentFee;
    private Double driverFee;
    private Double total;
}
