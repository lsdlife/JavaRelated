package com.thread.create;

/**
 * 线程休眠
 */
public class ThreadSleep {
    public static void main(String[] args) throws Exception {
        Thread t1=new MyThread("小红");
        // t1.setName("小红");
        t1.start();

        Thread t2=new MyThread("小白");
        //t2.setName("小白");
        t2.start();

        //哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        //主线程的名字就叫main
        Thread m=Thread.currentThread();
        System.out.println(m.getName());

        //
        m.setName("主线程");

        for (int i = 0; i <5 ; i++) {
            if(i==3){
                Thread.sleep(3000);   //单位ms
                System.out.println("休眠了一会");
            }
            System.out.println(m.getName()+"输出" + i);
        }
    }
}
