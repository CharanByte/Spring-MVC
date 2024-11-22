package com.xworkz.home.configuration;

import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.xworkz.home")
public class Configuration {
    Configuration(){
        System.out.println("created Configuration");
    }
}
