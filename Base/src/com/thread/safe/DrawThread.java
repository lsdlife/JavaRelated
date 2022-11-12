package com.thread.safe;

/**
 * 取钱的线程类
 */

public class DrawThread extends Thread {
    //接受处理的账户信息
    private Account acc;
    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //取钱方法运行
        acc.DrawMoney(1000);
    }
}
