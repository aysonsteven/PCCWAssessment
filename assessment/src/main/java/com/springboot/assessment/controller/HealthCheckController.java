package com.springboot.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment.service.NotificationService;

@RestController
@RequestMapping("/healthcherck")
public class HealthCheckController {
    
    @Autowired
    private NotificationService notif;

    @GetMapping
    public String healthCheck(){

        
        return "running";
    }
}
