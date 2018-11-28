package com.pattern.factory.FactoryPattern;

public class SenderFactory {
    public ISender Produce(Class obj){
        if(obj==MailSender.class){
            return new MailSender();
        }
        else if (obj==SmsSender.class){
            return new SmsSender();
        }
        else{
            return null;
        }
    }

    public ISender ProduceSms(){
        return new SmsSender();
    }

    public ISender ProduceMail(){
        return new MailSender();
    }
}
