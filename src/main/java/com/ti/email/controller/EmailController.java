package com.ti.email.controller;

import com.ti.email.model.Email;
import com.ti.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmailController {

    private final EmailService emailService;
    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping(value = "/getEmail/{emailId}")//gets a whole email object when pass in the object_id
    public Email getEmail(@PathVariable String emailId){
        return emailService.getEmailBy_id(emailId);
    }



}