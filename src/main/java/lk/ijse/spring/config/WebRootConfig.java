package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:53 PM
 * @since : v0.01.0
 **/
@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
    public WebRootConfig(){
        System.out.println("WebRootConfig : Instantiated");
    }
}
