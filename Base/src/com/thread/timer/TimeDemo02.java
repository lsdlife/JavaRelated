package com.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//定时器的实现方式二：ScheduledExecutorService

public class TimeDemo02 {
    public static void main(String[] args) {
        //1.创建ScheduledExecutorService线程池,做定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        //2.开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了AA "+new Date());
                try {
                    //线程池，这个线程在睡觉的时候会执行其他的线程
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        },0,2, TimeUnit.SECONDS);



        //
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了BB "+new Date());
                System.out.println(10 / 0); //出错后不再执行
            }
        },0,2, TimeUnit.SECONDS);


        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了CC "+new Date());
            }
        },0,2, TimeUnit.SECONDS);

    }

}
