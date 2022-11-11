package com.framework;

public class Student {
    private int age;
    private String name;
    private char sex;
    private String className;


    public Student() {
    }


    public Student(int age, String name, char sex, String className) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}

