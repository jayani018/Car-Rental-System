package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jayani_Arunika  10/25/2023 - 3:43 AM
 * @since : v0.01.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private String state;
    private String message;
    private Object data;

}
