package com.pattern.bridge;

public abstract class Bridge {

    private ISource source;

    public void Conn(){
        source.conn();
    }

}
