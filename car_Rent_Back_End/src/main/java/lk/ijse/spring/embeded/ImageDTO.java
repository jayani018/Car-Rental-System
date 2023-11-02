package lk.ijse.spring.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Embeddable;

/**
 * @author : Jayani_Arunika  11/2/2023 - 12:22 PM
 * @since : v0.01.0
 **/
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ImageDTO {
    private MultipartFile front_View;
    private MultipartFile back_View;
    private MultipartFile side_View;
    private MultipartFile interior;
}
