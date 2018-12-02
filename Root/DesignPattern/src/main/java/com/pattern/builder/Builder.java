package com.pattern.builder;

import com.pattern.factory.FactoryPattern.ISender;
import com.pattern.factory.FactoryPattern.MailSender;
import com.pattern.factory.FactoryPattern.SmsSender;

import java.util.ArrayList;
import java.util.*;

/**
 * 实现对工厂对象的复杂操作 再加工
 */
public class Builder {
    private List<ISender> list = new ArrayList<ISender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
