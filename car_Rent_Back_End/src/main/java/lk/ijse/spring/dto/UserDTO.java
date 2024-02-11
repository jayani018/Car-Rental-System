package lk.ijse.spring.dto;

import lk.ijse.spring.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:33 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {
    private String user_Id;
    private RoleType role_Type;
    private String user_Name;
    private String password;

    public UserDTO( RoleType role_Type, String user_Name, String password) {
        this.role_Type = role_Type;
        this.user_Name = user_Name;
        this.password = password;
    }
}
