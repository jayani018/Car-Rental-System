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
    private String userID;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleType role;


    public User(String userID, RoleType role, String userName, String password) {
        this.role = role;
        this.userName = userName;
        this.password = password;
    }
}
