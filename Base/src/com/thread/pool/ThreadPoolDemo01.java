package com.thread.pool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并测试其特性
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
        //1.创建线程池对象
        /**
         * int corePoolSize,
         *                               int maximumPoolSize,
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
        Runnable ru=new MyRunnable();
        pool.execute(ru);
        pool.execute(ru);
        pool.execute(ru);

        //可以看成是任务队列
        pool.execute(ru);
        pool.execute(ru);
        pool.execute(ru);
        pool.execute(ru);
        pool.execute(ru);

        //创建临时线程
        pool.execute(ru);
        pool.execute(ru);
//      //拒绝策略被触发
//        pool.execute(ru);


        //关闭线程池（开发中一般不会使用)
        pool.shutdownNow();     //立即关闭，即使任务没有完成，丢失任务的


    }

}
