package com.collection;

import java.util.AbstractCollection;
import java.util.Collection;

public abstract class MyAbstractCollection<E> extends AbstractCollection<E> {
    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }
}
