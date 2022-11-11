package com.inheritance.anonymous;

public class annoymous_exp {
    public static void main(String[] args) {

        //调用go()方法然后传对象进去
        go(new Swimming() {
            @Override
            public void run() {
                System.out.println("学生在游泳");
            }
        });

    }

    //
    public static void go(Swimming s){
        s.run();
    }

}


//不需要实现接口
/**
 * class student implements  Swimming{
 *
 *     @Override
 *     public void run() {
 *         System.out.println("学生在游泳");
 *     }
 * }
 */



interface  Swimming{
     void run();
}
