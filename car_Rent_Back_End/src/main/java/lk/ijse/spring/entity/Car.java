package lk.ijse.spring.entity;

import lk.ijse.spring.embeded.Image;
import lk.ijse.spring.embeded.Rate;
import lk.ijse.spring.enums.AvailabilityType;
import lk.ijse.spring.enums.CarType;
import lk.ijse.spring.enums.FuelType;
import lk.ijse.spring.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : Jayani_Arunika  10/29/2023 - 2:22 PM
 * @since : v0.01.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Car {
    @Id
    private String carId;
    private String name;
    private String brand;
    @Enumerated(EnumType.STRING)
    private CarType CarType;
    @Embedded
    private Image image;
    private int number_Of_Passengers;
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission_Type;
    @Enumerated(EnumType.STRING)
    private FuelType fuel_Type;
    @Embedded
    private Rate rent_Duration_Price;
    private double price_Extra_KM;
    private  String registration_Number;
    private double free_Mileage;
    private String color;
    @Enumerated(EnumType.STRING)
    private AvailabilityType vehicleAvailabilityType;

    public Car(String carId, String name, String brand, String type, Image image, int number_of_passengers, String transmission_type, String fuel_type, Rate rent_duration_price, double price_extra_km, String registration_number, double free_mileage, String color, AvailabilityType vehicleAvailabilityType) {
    }
}
