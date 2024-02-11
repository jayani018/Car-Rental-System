package lk.ijse.spring.entity;

import lk.ijse.spring.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:43 PM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    @Id
    private String user_Id;
    @Enumerated(EnumType.STRING)
    private RoleType role_Type;
    private String user_Name;
    private String password;



    public User( RoleType role_Type, String user_Name, String password) {
        this.role_Type = role_Type;
        this.user_Name = user_Name;
        this.password = password;
    }
}
