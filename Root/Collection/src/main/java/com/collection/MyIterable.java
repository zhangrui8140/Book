package com.collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIterable<T> implements Iterable<T> {
    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
