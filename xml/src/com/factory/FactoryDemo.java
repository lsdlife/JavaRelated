package com.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer c1 = FactoryPattern.creatComputer("Mac");
        c1.start();

    }
}
