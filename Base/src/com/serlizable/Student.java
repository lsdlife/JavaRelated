package com.serlizable;

import java.io.Serializable;

//对象要序列化，必须实现Serializable接口

public class Student implements Serializable{

    private String name;
    private String logname;
    //如果变量不参与序列化，加transient修饰;
    private transient int age;

    public Student() {
    }

    public Student(String name, String logname, int age) {
        this.name = name;
        this.logname = logname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", logname='" + logname + '\'' +
                ", age=" + age +
                '}';
    }
}
