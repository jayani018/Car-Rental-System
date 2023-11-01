package lk.ijse.spring.dto;

import lk.ijse.spring.enums.AvailabilityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

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
    private String userID;
    private String name;
    private String contactNo;
    private String address;
    private String email;
    private String nic;
    private String licenseNo;
    private MultipartFile licenseImg;
    private AvailabilityType driverAvailability;

    private UserDTO user;
}
