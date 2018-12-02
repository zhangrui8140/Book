package com.pattern.factory.FactoryPattern;

public class SmsSender implements ISender {
    @Override
    public void Send() {
        System.out.println("Sms");
    }
}
