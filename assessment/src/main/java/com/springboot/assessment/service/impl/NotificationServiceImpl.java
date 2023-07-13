package com.springboot.assessment.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.assessment.dto.EmailDto;
import com.springboot.assessment.entity.TblCustomer;
import com.springboot.assessment.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{

    private RestTemplate rest = new RestTemplate();

    @Override
    public String sendNotification(TblCustomer body) {
        String url = "http://localhost:8081/email/send";
        HttpEntity<EmailDto> request = new HttpEntity<>(buildEmailBody(body));
        rest.postForObject(url, request, String.class);
        return "Sent";
    }

    private EmailDto buildEmailBody(TblCustomer customer) {
        // TODO Auto-generated method stub
        EmailDto dto = new EmailDto();
        dto.setRecipient(customer.getEmail());
        dto.setSubject("Successful Registration for " + customer.getName());
        dto.setContent("Hello " + customer.getName()  + "you are now registered");
        return dto;
    }
    
}
