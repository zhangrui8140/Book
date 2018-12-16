package com.collection;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class MyCollectionTest {

    @Test
    public void add() {
        MyCollection<Integer> myCollection=new MyCollection<>();
        //myCollection.add(1);
        myCollection.addAll(Collections.singletonList(2));
    }
}