package com.example.demosendingemail.resources;

public class Email {
    private String to;
    private String subject;
    private String msgBody;

    public Email() {
    }

    public Email(String to, String subject, String msgBody) {
        this.to = to;
        this.subject = subject;
        this.msgBody = msgBody;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }
}
