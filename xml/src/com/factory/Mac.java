package com.factory;

public class Mac extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "mac电脑");
    }

}
