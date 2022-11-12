package com.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 方案三 实现Callable接口，结合FutureTask完成
 * 这种方式可以得到线程执行的结果
 */

public class ThreadDemo03 {
    public static void main(String[] args) {
        //3.创建Callable任务对象
        Callable c = new MyCallable(100);

        //4.把callable对象交给FutureTask
        //FutureTask可以调用get()方法得到结果
        FutureTask<String> f = new FutureTask<>(c);    //FutureTask是Runable对象，可以交给Thread

        //5.交给Thread对象
        Thread t = new Thread(f);
        //6.启动线程
        t.start();
        try {
            String rs = f.get();
            System.out.println("第一个结果：" + rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("--------------");

        Callable c1 = new MyCallable(200);
        //4.把callable对象交给FutureTask
        //FutureTask可以调用get()方法得到结果
        FutureTask<String> f1 = new FutureTask<>(c1);      //FutureTask是Runable对象，可以交给Thread

        //5.交给Thread对象
        Thread t1 = new Thread(f1);
        //6.启动线程
        t1.start();
        try {
            String rs1 = f1.get();
            System.out.println("第二个结果：" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//1.定义一个任务类，实现callable接口，应该申明任务执行完毕后的结果数据类型

class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}
