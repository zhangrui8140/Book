package com.collection.set;


import java.util.Collection;
import java.util.TreeSet;

public class MyTreeSet<E> extends TreeSet<E> {
    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }
}
