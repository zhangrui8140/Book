package com.pattern.factory.FactoryPattern;

/**
 * 普通工厂  抽象对象行为
 * 抽象工厂  抽象工厂类型
 *           MailSenderFactory   MailSender
 * IProvider                                    ISender
 *           SmsSenderFactory    SmsSender
 */
public class FactoryPattern {
    public static void main(String[] args) {
        IProvider provide=new MailSenderFactroy();
        ISender sender=provide.Produce();
        sender.Send();
       /* SenderFactory factory = new SenderFactory();
        ISender sender = factory.Produce(MailSender.class);
        sender.Send();*/
    }
}
