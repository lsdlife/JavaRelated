package com.generics;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmw = new ArrayList<>();
        bmw.add(new BMW());
        bmw.add(new BMW());
        bmw.add(new BMW());
        go(bmw);

        ArrayList<BENZ> benz = new ArrayList<>();
        benz.add(new BENZ());
        benz.add(new BENZ());
        benz.add(new BENZ());
        go(benz);

        ArrayList<Dog> dog = new ArrayList<>();
        dog.add(new Dog());
        //go(dog);
    }
    //ArrayList<Cars>和ArrayList<BENZ>，ArrayList<BWM>是三个不同的集合类
    public static void go(ArrayList<? extends Car> car) {   //上下限
    }
}

class Dog {
}

class Car {
}

class BENZ extends Car {
}

class BMW extends Car {
}
