package lk.ijse.spring.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

/**
 * @author : Jayani_Arunika  11/2/2023 - 12:22 PM
 * @since : v0.01.0
 **/
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Rate {
    private double daily_Rate;
    private double monthly_Rate;
}
