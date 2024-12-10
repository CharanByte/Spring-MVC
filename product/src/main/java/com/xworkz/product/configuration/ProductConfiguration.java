package com.xworkz.product.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.product")
public class ProductConfiguration {

    ProductConfiguration(){
        System.out.println("running productConfiguration");
    }
}
