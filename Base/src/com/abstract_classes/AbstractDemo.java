package com.abstract_classes;

//1.定义抽象类
public abstract class AbstractDemo {
    //2.定义两个方法，一个是能确定的方法和代码用作模板方法
    //加final防止被子类重写
    public final void run(){
        System.out.println("every body can run!");
    }
    //3.定义一个抽象方法让子类具体实现，这里是不能确定的代码
    abstract  void eat();

    private int age;

}
