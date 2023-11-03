package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jayani_Arunika  11/3/2023 - 4:02 PM
 * @since : v0.01.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class RentDetailsDTO {
    private String carID;
    private String rentID;
    private String driverID;
}
