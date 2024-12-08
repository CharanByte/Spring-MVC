package com.xworkz.forms.service;

import com.xworkz.forms.dto.BankDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankService {

    boolean isValidAndSave(BankDTO bankDTO);
}
