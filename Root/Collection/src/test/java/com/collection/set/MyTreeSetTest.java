package com.collection.set;

import org.junit.Test;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;

import static org.junit.Assert.*;

public class MyTreeSetTest {

    @Test
    public void add() {
        SortedSet<Student> myTreeSet=new MyTreeSet<>();
        myTreeSet.add(new Student("A",21,90.5));
        myTreeSet.add(new Student("B",25, 90.3));
        myTreeSet.add(new Student("C",23,90.9));
        myTreeSet.first();
    }
}
class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private Double score;

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}