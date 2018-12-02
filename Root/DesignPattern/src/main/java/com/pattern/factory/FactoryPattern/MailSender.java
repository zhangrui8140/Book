package com.pattern.factory.FactoryPattern;

public class MailSender implements ISender {
    @Override
    public void Send() {
        System.out.println("mail");
    }
}
