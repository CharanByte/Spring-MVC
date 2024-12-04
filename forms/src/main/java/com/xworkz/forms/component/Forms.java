package com.xworkz.forms.component;

import com.xworkz.forms.dto.ScholarshipDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Forms {
    Forms(){
        System.out.println("running No args forms const");
    }
@RequestMapping("scholarship")
    public  String applyScholarship(ScholarshipDTO scholarshipDTO){
        System.out.println("running applyScholarship");
    System.out.println(scholarshipDTO);
        return "scholarshipform.jsp";
    }

}
