package lk.ijse.spring.entity;

import lk.ijse.spring.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.naming.Name;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:54 AM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserRegi {
    @Id
    private String userID;
    private Name name;
    private String contactNo;
    private String address;
    private String email;
    private String nic;
    private String licenseNo;
    private String nicImg;
    private String licenseImg;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public UserRegi(String userID, String name, String contactNo, String address, String email, String nic, String licenseNo, String nicImg, String licenseImg, User user) {

    }
}
