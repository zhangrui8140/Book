package com.pattern.proxy;

public class Proxy implements ISource {

    private Source source;

    public Proxy(Source source){
        this.source=source;
    }

    @Override
    public void method() {
        BeforeCallMethod();
        method();
        AfterCallMethod();
    }

    private void BeforeCallMethod(){

    }
    private void AfterCallMethod(){

    }

}
