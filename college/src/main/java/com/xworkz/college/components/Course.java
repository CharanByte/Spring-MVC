package com.xworkz.college.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:app.properties")

public class Course {
    @Autowired
    @Qualifier("name")
    private  String names;

    @Value("${dbUserName}")
            private String userName;

    @Value("${dbPassword}")
            private String password;
    Course(){
        System.out.println("running Course");
    }

    @PostConstruct
    public  void print(){
        System.out.println("userName : "+userName);
        System.out.println("password : "+password);
    }
}
