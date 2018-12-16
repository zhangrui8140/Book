package com.collection.list;

import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() {
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.addFirst(4);
        myLinkedList.add(2,5);
        myLinkedList.addAll(Collections.singletonList(6));
        myLinkedList.addAll(3,Collections.singletonList(6));
        myLinkedList.addLast(10);
        for (Iterator<Integer> it = myLinkedList.descendingIterator(); it.hasNext(); ) {
            Integer i = it.next();
            System.out.print(i);
        }

    }
}