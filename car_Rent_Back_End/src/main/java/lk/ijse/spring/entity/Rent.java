package lk.ijse.spring.entity;

import lk.ijse.spring.enums.RentRequest;
import lk.ijse.spring.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author : Jayani_Arunika  11/3/2023 - 4:13 PM
 * @since : v0.01.0
 **/
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Rent {
    @Id
    private String rentID;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    @Enumerated(EnumType.STRING)
    private RequestType requestType;
    @Enumerated(EnumType.STRING)
    private RentRequest rentType;
    private String location;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "userID", referencedColumnName = "user_Id", nullable = false)
    private Reg_User regUser;

    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL)
    private List<RentDetails> rentDetails;
}
