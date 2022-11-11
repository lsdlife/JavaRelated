package com.inheritance;

public class TestExtends {
    public static void main(String[] args) {
        Person p=new Person("小李");
        System.out.println("P的name: "+p.name);

        Girl g=new Girl("aaa");
        System.out.println("girl的名字"+g.name);

    }
}
