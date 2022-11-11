package com.proxy;

public class Test {
    public static void main(String[] args) {
        //学习开发出一个代理对象，理解动态代理的执行流程
        //1.创建一个对象（杨超越）,类必须实现接口
        Star s = new Star("杨超越");
        //为杨超越对象生成一个代理对象（经纪人）
        Skill s2 = StarAgentProxy.getProxy(s);
        s2.jump();  //走代理的
        s2.sing();


    }
}
