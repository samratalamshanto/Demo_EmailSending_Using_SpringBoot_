package com.example.demosendingemail.controller;

import com.example.demosendingemail.resources.Email;
import com.example.demosendingemail.service.EmailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send-email")
    public ResponseEntity sendmail(@RequestBody Email email) {
        try {
            emailSenderService.sendEmail(email.getTo(), email.getSubject(), email.getMsgBody());
            return ResponseEntity.ok("Success");
        }
        catch (Exception e)
        {
            return ResponseEntity.internalServerError().body("Unsuccessful");
        }
    }
}
