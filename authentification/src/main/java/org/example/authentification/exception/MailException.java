package org.example.authentification.exception;

public class MailException extends org.springframework.mail.MailException {
    public MailException(String message) {
        super(message);
    }
}