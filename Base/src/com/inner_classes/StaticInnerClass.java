package com.inner_classes;

/**
 * 静态内部类：汽车有发动机类
 */
public class StaticInnerClass {
    static int age;
    String name;




    //静态内部类
     static class Inner{

        public void run(){
            //静态成员属于类，通过类名访问，同类中可以不写类名。
            //如果不在方法里面写，那就相当于this.age=20这样是不可以的。
            age=20;     //等价于StaticInnerClass.age=20;
            StaticInnerClass s=new StaticInnerClass();
            s.name="aaa";
            System.out.println("静态内部类");
        }
    }
}
