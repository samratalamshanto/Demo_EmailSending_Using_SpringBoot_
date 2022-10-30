package com.example.demosendingemail.service;

public interface EmailSenderService {
    void sendEmail(String to,String subject, String msgBody);
}
