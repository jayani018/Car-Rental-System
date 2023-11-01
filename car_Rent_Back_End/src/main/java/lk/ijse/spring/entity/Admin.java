package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author : Jayani_Arunika  10/29/2023 - 2:12 PM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Admin {
    @Id
    private String userID;
    private String name;
    private String contactNo;
    private String address;
    private String email;
    private String nic;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}
