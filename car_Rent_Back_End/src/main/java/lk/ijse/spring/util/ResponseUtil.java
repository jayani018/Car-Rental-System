package lk.ijse.spring.util;

import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.dto.UserRegiDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

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
