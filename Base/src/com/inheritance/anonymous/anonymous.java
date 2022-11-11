package com.inheritance.anonymous;

public class anonymous {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("this is tiger的run方法");
            }
        };
        a.run();
    }

}


//不需要继承抽象类
/**
 *
 * class Tiger extends Animal{
 *     @Override
 *     public void run() {
 *
 *     }
 * }
 */


abstract class Animal{
    public abstract void  run();
}