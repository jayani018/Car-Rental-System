package lk.ijse.spring.dto;

import lk.ijse.spring.embeded.Name;
import lk.ijse.spring.enums.AvailabilityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Jayani_Arunika  10/29/2023 - 1:37 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic_No;
    private String license_No;
    private MultipartFile license_Img;
    private AvailabilityType driverAvailability;

    private UserDTO user;
}
