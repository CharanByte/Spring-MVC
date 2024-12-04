package com.xworkz.forms.component;

import com.xworkz.forms.dto.JobDTO;
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
    @RequestMapping("job")
    public  String applyJob(JobDTO jobDTO){
        System.out.println("running applyJob");
        System.out.println(jobDTO);
        return "job.jsp";
    }

}
