package com.thread.safe;

public class ThreadDemo {
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享的账户对象
        Account acc = new Account("ICBC-999", 1000);
        //2.创建两个线程对象，小红和小明同时操作
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
