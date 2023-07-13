package com.springboot.assessment.emailservice.service.impl;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

// import javax.mail.MessagingException;
// import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.springboot.assessment.emailservice.dto.EmailDto;
import com.springboot.assessment.emailservice.service.EmlService;

@Service
public class EmailServiceImpl implements EmlService{

    private Environment env;

    @Value("$spring.mail.username")
    private String username;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void send(EmailDto body) {
        // MimeMessage mimeMessage = mailSender.createMimeMessage();
        // MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(body.getRecipient());
        message.setSubject(body.getSubject());
        message.setText(body.getContent());
        mailSender.send(message);
    }
    
}
