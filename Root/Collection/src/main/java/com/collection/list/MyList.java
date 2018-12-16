package com.collection.list;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyList<E> extends AbstractList<E> {

    //region read



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
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, c);
    }
    //endregion


    protected MyList() {
        super();
    }

    @Override
    public E set(int index, E element) {
        return super.set(index, element);
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return super.lastIndexOf(o);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return super.iterator();
    }

    @Override
    public ListIterator<E> listIterator() {
        return super.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return super.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public E get(int index) {
        return null;
    }

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
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
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
    public String toString() {
        return super.toString();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {

    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
