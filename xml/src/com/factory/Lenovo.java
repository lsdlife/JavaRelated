package com.factory;

public class Lenovo extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "小新电脑");
    }
}
