package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList<E> extends ArrayList<E> {



    /**************20181215****************/
    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, c);
    }
}
