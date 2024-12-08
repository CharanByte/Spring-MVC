package com.xworkz.forms.controller;

import com.xworkz.forms.dto.PassportDTO;
import com.xworkz.forms.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    private PassportService passportService;
    PassportController(){
        System.out.println("running PassportController");
    }

    @RequestMapping("/passport")
    public String onClick(PassportDTO passportDTO){
        System.out.println(passportDTO);
        boolean valid=passportService.isValidAnSave(passportDTO);
        if(valid)
            System.out.println("valid");
        else
            System.err.println("not valid");
        return "Passport.jsp";
    }
}
