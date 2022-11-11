package com.thread.pool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并测试其特性
 */
public class ThreadPoolDemo02 {
    public static void main(String[] args) throws  Exception {
        //1.创建线程池对象
        /**
         * int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool= new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        //2.给任务线程池处理
        Future<String> f1=pool.submit( new MyCallable(100));
        Future<String> f2=pool.submit( new MyCallable(200));
        Future<String> f3=pool.submit( new MyCallable(300));
        Future<String> f4=pool.submit( new MyCallable(400));
        Future<String> f5=pool.submit( new MyCallable(400));


        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());



        //创建临时线程

//        //拒绝策略被触发
//        pool.execute(ru);


        //关闭线程池（开发中一般不会使用)
        pool.shutdownNow();     //立即关闭，即使任务没有完成，丢失任务的

    }

}
