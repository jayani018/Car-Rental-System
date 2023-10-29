package lk.ijse.spring.dto;

import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jayani_Arunika  10/29/2023 - 2:18 PM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDTO {
    private String carId;
    private String name;
    private String brand;
    private String type;
    private String image;
    private int number_Of_Passengers;
    private String transmission_Type;
    private String fuel_Type;
    private String rent_Duration_Price;
    private String price_Extra_KM;
    private  String registration_Number;
    private double free_Mileage;
    private String color;
    private String vehicleAvailabilityType;
}
