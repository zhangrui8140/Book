package com.collection;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> extends MyAbstractCollection<E>{

    //region read



    /**************20181215****************/
    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }
    //endregion


    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return super.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return super.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return super.retainAll(c);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
