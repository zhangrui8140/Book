package com.collection.list;

import java.util.Collection;
import java.util.List;

public interface MyIList<E> extends List<E> {
    @Override
    boolean add(E e);

    @Override
    boolean addAll(Collection<? extends E> c);

    @Override
    boolean addAll(int index, Collection<? extends E> c);

    @Override
    void add(int index, E element);
}
