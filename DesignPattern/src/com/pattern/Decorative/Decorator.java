package com.pattern.Decorative;

public class Decorator implements ISource {

    private Source source;

    public Decorator(Source source){
        this.source = source;
    }

    @Override
    public void M1() {

    }

    @Override
    public void M2() {

    }
}
