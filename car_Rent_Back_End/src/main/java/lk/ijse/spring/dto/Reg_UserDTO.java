package lk.ijse.spring.dto;

import lk.ijse.spring.embeded.Name;
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
public class Reg_UserDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private MultipartFile nic_Img;
    private MultipartFile license_Img;

    private UserDTO user;


}
