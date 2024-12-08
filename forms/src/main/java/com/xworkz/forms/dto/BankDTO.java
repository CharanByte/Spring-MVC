package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankDTO {
    private String UserName;
    private  long number;
    private int otp;
}
