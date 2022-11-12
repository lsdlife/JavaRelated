package com.object;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("name:" + this.name + "age:" + this.age);
    }
    /**
     * public static boolean equals(Object a,Object b){
     *     return (a==b) ||(a!=null && a.euqals(b));
     * }
     */
}
