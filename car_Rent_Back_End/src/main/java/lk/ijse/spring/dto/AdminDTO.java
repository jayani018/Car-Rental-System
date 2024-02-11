package lk.ijse.spring.dto;

import lk.ijse.spring.embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jayani_Arunika  10/29/2023 - 2:09 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;

    private UserDTO user;
}
