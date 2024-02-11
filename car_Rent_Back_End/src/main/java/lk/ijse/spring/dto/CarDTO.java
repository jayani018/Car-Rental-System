package lk.ijse.spring.dto;

//import javafx.scene.image.Image;
import lk.ijse.spring.embeded.ImageDTO;
import lk.ijse.spring.embeded.Rate;
import lk.ijse.spring.enums.AvailabilityType;
import lk.ijse.spring.enums.CarType;
import lk.ijse.spring.enums.FuelType;
import lk.ijse.spring.enums.TransmissionType;
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
    private String car_Id;
    private String name;
    private String brand;
    private CarType type;
    private ImageDTO image;
    private int number_Of_Passengers;
    private TransmissionType transmission_Type;
    private FuelType fuel_Type;
    private Rate rent_Duration_Price;
    private double price_Extra_KM;
    private  String registration_Number;
    private double free_Mileage;
    private String color;
    private AvailabilityType vehicleAvailabilityType;
}
