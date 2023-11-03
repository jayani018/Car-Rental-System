package lk.ijse.spring.dto;

import lk.ijse.spring.enums.RentRequest;
import lk.ijse.spring.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author : Jayani_Arunika  11/3/2023 - 4:02 PM
 * @since : v0.01.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class RentDTO {
    private String rentID;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private RequestType requestType;
    private RentRequest rentType;
    private String location;
    private UserRegiDTO regUser;

    private List<RentDetailsDTO> rentDetails;
}
