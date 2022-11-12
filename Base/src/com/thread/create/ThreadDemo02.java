package com.thread.create;

/**
 * 学会线程的创建方式二，实现Runnable接口，理解它的优缺点
 */

public class ThreadDemo02 {
    public static void main(String[] args) {
        //3.创建一个MyRunnable对象
        Runnable mr = new MyRunnable();
        //4.把任务对象交给Thread处理
        Thread t = new Thread(mr, "小白");
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i);
        }
    }
}

//1.定义一个线程任务类，实现Runnable接口
class MyRunnable implements Runnable {
    //2.重写run方法，定义线程的执行任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行" + i);
        }
    }
}
