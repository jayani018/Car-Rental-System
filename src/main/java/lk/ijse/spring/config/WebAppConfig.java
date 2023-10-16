package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Jayani_Arunika  10/15/2023 - 5:53 PM
 * @since : v0.01.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring.controller")
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig : Instantiated");
    }
}
