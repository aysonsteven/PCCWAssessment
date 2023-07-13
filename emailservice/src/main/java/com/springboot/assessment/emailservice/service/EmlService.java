package com.springboot.assessment.emailservice.service;

import com.springboot.assessment.emailservice.dto.EmailDto;

public interface EmlService {
    
    public void send(EmailDto body);
}
