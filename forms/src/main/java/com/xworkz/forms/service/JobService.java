package com.xworkz.forms.service;

import com.xworkz.forms.dto.JobDTO;

public interface JobService {

    boolean validAndSave(JobDTO jobDTO);
}
