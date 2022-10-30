package com.example.demosendingemail.service.impl;

import com.example.demosendingemail.service.EmailSenderService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    //injected

    private final JavaMailSender mailSender;

    public EmailSenderServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(String to, String subject, String msgBody) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("samrat.reddot@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(msgBody);

        this.mailSender.send(simpleMailMessage);
    }
}
