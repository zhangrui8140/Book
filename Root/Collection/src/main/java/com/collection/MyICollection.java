package com.collection;

import java.util.Collection;

public interface MyICollection<E> extends Collection {
    @Override
    boolean add(Object o);

    @Override
    boolean addAll(Collection c);
}
