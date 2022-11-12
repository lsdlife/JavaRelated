package com.thread.create;

/**
 * 线程的API:setName(),getName(),currentThread()
 */

public class ThreadAPIDemo01 {
    public static void main(String[] args) {
        //setName()
        Thread t1 = new MyThread("小红");
        // t1.setName("小红");
        t1.start();
        Thread t2 = new MyThread("小白");
        //t2.setName("小白");
        t2.start();

        //哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        //主线程的名称就叫main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        m.setName("主线程");
        for (int i = 0; i < 5; i++) {
            System.out.println(m.getName() + "输出" + i);
        }
    }
}
