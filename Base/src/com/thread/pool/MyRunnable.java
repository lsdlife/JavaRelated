package com.thread.pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"输出了 hello world "+i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "线程进入睡眠");
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
