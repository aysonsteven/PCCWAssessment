package com.springboot.assessment.emailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment.emailservice.dto.EmailDto;
import com.springboot.assessment.emailservice.service.EmlService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/email")
public class EmailController {
    
    @Autowired 
    private EmlService emailService;
    
 

    @PostMapping(value="/send")
    public String postMethodName(@RequestBody EmailDto body) {
        //TODO: process POST request

        emailService.send(body);
        return "Sent";
    }
    
}
