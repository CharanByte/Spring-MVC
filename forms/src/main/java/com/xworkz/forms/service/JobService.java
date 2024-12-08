package com.xworkz.forms.service;

import com.xworkz.forms.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public interface JobService {

    boolean validAndSave(JobDTO jobDTO);
}
