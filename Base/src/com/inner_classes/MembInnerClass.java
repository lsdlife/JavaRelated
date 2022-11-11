package com.inner_classes;

public class MembInnerClass {
    static String name;
    int money;
    //1.成员内部类
    public class Inner{
       //public static int age=20;
       public void run(){
           name="aaa";   //可以直接访问外部类的静态成员
           money=200;   //可以直接访问外部类的实例成员，必须先有外部类对象才能有内部类对象。
       }
    }

}
