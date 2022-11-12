package com.thread.create;

/**
 * 创建方式1，继承Thread类。
 */

public class ThreadDemo01 {
    public static void main(String[] args) {
        //3.new一个新线程
        Thread t = new MyThread();
        //4.调用start方法启动线程（执行的还是run方法)

        t.start();
        //不要把主线程任务放在子线程之前，不然就是一个单线程效果
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}

//1.定义一个线程类继承Thread类
class MyThread extends Thread {
    public MyThread() {
    }
    public MyThread(String name) {
        super(name);
    }
    //2.重写run方法，定义线程要做什么

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行输出" + i);
        }
    }
}
