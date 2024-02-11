package lk.ijse.spring.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

/**
 * @author : Jayani_Arunika  1/29/2024 - 9:43 AM
 * @since : v0.01.0
 **/

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Name {
    String firstName;
    String LastName;
}
