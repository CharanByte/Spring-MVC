package com.xworkz.forms.service;

import com.xworkz.forms.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImp implements PassportService{

    PassportServiceImp(){
        System.out.println("running PassportServiceImp");
    }
    @Override
    public boolean isValidAnSave(PassportDTO passportDTO) {
        return true;
    }
}
