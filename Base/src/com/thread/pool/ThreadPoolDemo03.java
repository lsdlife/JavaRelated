package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用Executors工具类直接得到不同特点的线程池对象
 */

public class ThreadPoolDemo03 {
    public static void main(String[] args) {
        //1.创建固定数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        //已经没有多余的线程了
        pool.execute(new MyRunnable());
    }
}
