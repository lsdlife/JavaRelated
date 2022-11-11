package com.ploymorphism;

public class TestDuoTai {
    public static void main(String[] args) {

        //1.方法调用，运行看右边
        Animal c=new Cat();
        c.run();
        Animal d=new Dog();
        d.run();

        //2.变量调用，运行看左边
        System.out.println(c.age);      //100
        System.out.println(d.age);      //100

    }
}
