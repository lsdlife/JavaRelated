package com.thread.create;

/**
 * 学会线程的创建方式二（匿名内部类方式）
 */
public class ThreadDemo02Other {
    public static void main(String[] args) {
        //3.创建一个MyRunnable对象
        /**
         *     Runnable mr=new Runnable() {
         *             @Override
         *             public void run() {
         *                 for (int i = 0; i < 5; i++) {
         *                     System.out.println("子线程执行" + i);
         *                 }
         *             }
         *         };
         */

        //4.把任务对象交给Thread处理
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程执行" + i);
            }
        });

        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i);
        }
    }

}
