package com.collection.set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MyHashSetTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test(){
        Set<Integer> hashSet=new MyHashSet();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.addAll(Collections.singletonList(2));
    }
}