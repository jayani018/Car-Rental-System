package lk.ijse.spring.entity;

import lk.ijse.spring.embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:54 AM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Reg_User {
    @Id
    private String user_Id;

    @Embedded
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private String nic_Img;
    private String license_Img;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}
