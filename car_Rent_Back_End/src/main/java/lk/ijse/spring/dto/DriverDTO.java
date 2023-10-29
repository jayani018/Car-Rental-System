package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.lang.model.element.Name;

/**
 * @author : Jayani_Arunika  10/29/2023 - 1:37 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String driverId;
    private Name name;
    private String contactNo;
    private String address;
    private String email;
    private String nic;
    private String licenseNo;
    private String licenseImg;
    private String driverAvailability;

    private UserDTO user;
}
