package com.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器的实现方式一 :Timer定时器
 */

public class TimeDemo01 {
    public static void main(String[] args) {
        //1.创建Timer定时器,定时器本身就是一个单线程
        Timer timer = new Timer();
        //2.调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AA " + new Date());
                try {
                    //timer是单线程，所以必须要走睡眠
                    //不管是5000还是6000都是这样的方式
                    Thread.sleep(4000);
                    /**
                     * CC执行完之后，线程已经重新进入AA的执行阶段了，所以CC后面是AA
                     */
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2000);   //第二个参数是延迟，第三个参数是隔多久调用一次run()方法

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BB " + new Date());
                System.out.println(10 / 0);   //全部线程挂
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行CC " + new Date());
            }
        }, 0, 2000);
    }
}
