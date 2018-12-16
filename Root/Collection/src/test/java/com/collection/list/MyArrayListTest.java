package com.collection.list;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void add() {

        Object myArray1= Array.newInstance(Integer.class,5);
        Array.set(myArray1,0,1);
        Array.set(myArray1,1,2);
        Array.set(myArray1,2,3);
        Integer[] myArray2= {21,22,23,24,25};
        System.arraycopy(myArray1,1,myArray2,2,3);
        List<Integer> resultList = Arrays.asList(myArray2);//can't add 无法添加　Arrays 内部　ArrayList　
        resultList.add(1);
        Collections.addAll(resultList,myArray2);


        List<Integer> myArrayList=new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(1,3);
        myArrayList.addAll(Collections.singletonList(4));
    }
}