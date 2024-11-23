package com.xworkz.airpods.configuration;

import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.xworkz.airpods")
public class Configuration {
    Configuration(){
        System.out.println("created Configuration const");
    }
}
