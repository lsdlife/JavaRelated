package com.inheritance.anonymous;

abstract  class Person{
    abstract  void eat();
}

/**
public class testanonymous2 {
    public static void main(String[] args) {
        Person p=new Person(){
            void eat(){
                System.out.println("nice food ");
            }
        };
        p.eat();
    }
}
 */


//简写版
public class testanonymous2 {
    public static void main(String[] args) {
        Person p=new Person(){
            void eat(){
                System.out.println("nice food ");
            }
        };
        p.eat();
    }
}
