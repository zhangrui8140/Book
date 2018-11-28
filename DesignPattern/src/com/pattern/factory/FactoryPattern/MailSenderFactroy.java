package com.pattern.factory.FactoryPattern;

public class MailSenderFactroy implements IProvider {
    @Override
    public ISender Produce() {
        return new MailSender();
    }
}
