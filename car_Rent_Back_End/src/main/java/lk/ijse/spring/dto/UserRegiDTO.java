package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:54 AM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserRegiDTO {
    private String userId;
    private String name;
    private String contactNo;
    private String address;
    private String email;
    private String nic;
    private String licenseNo;
    private MultipartFile nicImg;
    private MultipartFile licenseImg;

    private UserDTO user;


}
