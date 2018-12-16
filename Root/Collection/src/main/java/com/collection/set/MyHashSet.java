package com.collection.set;

import java.util.Collection;
import java.util.HashSet;

public class MyHashSet<E> extends HashSet<E> {
    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }
}
