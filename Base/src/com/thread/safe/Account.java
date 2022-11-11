package com.thread.safe;

import java.util.concurrent.locks.*;

public class Account {
    private  String CardId;
    private  double money;

    //final修饰后唯一不可替换
    private final Lock lo=new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        CardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    /**
     * 调用取钱方法
     * @param money
     */
    public  void DrawMoney(double money ) {
       String name= Thread.currentThread().getName();
        lo.lock();
        //1.判断账户是否需要钱
        if(this.money>=money){
            //2.取钱
            System.out.println(name + ",来取钱成功,吐出" + money);
            //3.更新余额
            this.money-=money;
            System.out.println(name + ",取钱后剩余" + this.money);
        }else{
            System.out.println(name + ",来取钱，余额不足！" );
        }
        lo.unlock();

    }
}
