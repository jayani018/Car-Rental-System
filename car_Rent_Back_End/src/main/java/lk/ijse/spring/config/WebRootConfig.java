package lk.ijse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:53 PM
 * @since : v0.01.0
 **/
@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackages = "lk.ijse.spring.service")
public class WebRootConfig {
    public WebRootConfig(){
        System.out.println("WebRootConfig : Instantiated");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
