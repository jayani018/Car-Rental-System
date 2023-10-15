package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:43 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    @Id
    private String userID;
    private String name;
    private String email;
    private String password;
    private int DOB;
    private String role;
}
