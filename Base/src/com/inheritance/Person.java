package com.inheritance;

public class Person {
    String name;
    int age;
    Person(String name) {
        this.name = name;
    }
    void run() {
        System.out.println("父类的run方法");
    }
}
