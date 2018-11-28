package com.pattern.adapter;

/**
 * 与对象适配器模式类似
 */
public class ObjectAdapter implements ITarget {

    public Source source;

    public ObjectAdapter(Source source){
        this.source=source;
    }


    @Override
    public void SourceMethod() {
        source.SourceMethod();
    }

    @Override
    public void TargetM2() {

    }
}
