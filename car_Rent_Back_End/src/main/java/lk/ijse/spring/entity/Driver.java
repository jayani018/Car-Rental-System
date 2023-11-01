package lk.ijse.spring.entity;

import lk.ijse.spring.enums.AvailabilityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.boot.model.relational.Sequence;

import javax.lang.model.element.Name;
import javax.persistence.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 1:56 PM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Driver {
    @Id
    private String userID;
    private String name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private String license_Img;
    @Enumerated(EnumType.STRING)
    private AvailabilityType driverAvailability;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}
