package com.generics;

//泛型类

public class TestClassDemo {
    public static void main(String[] args) {

        //自定义一个MyArrayList,实现增加和删除
        ClassDemo<String> list=new ClassDemo<>();
        list.add("java");
        list.add("java");
        list.add("Mysql");


        ClassDemo<Integer> list1=new ClassDemo<>();
        list1.add(111);
        list1.add(222);
        list1.add(333);


    }
}
