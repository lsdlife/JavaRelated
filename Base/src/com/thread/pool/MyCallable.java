package com.thread.pool;

import java.util.concurrent.Callable;

//1.定义一个任务类，实现callable接口，应该申明任务执行完毕后的结果数据类型

class MyCallable implements Callable<String>{
    private  int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+
                "线程执行的结果是："+sum;
    }
}
