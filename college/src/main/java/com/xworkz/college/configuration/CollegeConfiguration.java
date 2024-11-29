package com.xworkz.college.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.college")

public class CollegeConfiguration {
    CollegeConfiguration(){
        System.out.println("running CollegeConfiguration");
    }
    @Bean
    public  String name(){
        System.out.println("running name method");
        return "charan";
    }
    @Bean
    public  String location(){
        System.out.println("running location method");
        return "kolar";
    }
}
