package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jayani_Arunika  11/3/2023 - 4:01 PM
 * @since : v0.01.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class DriverSheduleDTO {
    private String driverID;
    private String rentID;
}
