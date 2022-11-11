package com.inheritance;

public class Girl extends Person {


    String name;
    private int money;

    Girl(String name){
        super("aaa");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        super.name = "aaa";
        this.name = name;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void run() {
        System.out.println("子类用super调用父类的成员方法");
        super.run();
        System.out.println("女儿" + this.getName() + "的run方法");
    }

}
