package com.lambda;

@FunctionalInterface
interface Person {
    void run();
}

public class LambdaDemo {
    public static void main(String[] args) {
//         Person p=new Person() {
//        @Override public void run() {
//        System.out.println("he is running ");
//        }
//        };

        //格式1
//         Person p=()->{
//         System.out.println("he is running ");
//         };

        //格式2
        go(() -> {
            System.out.println("he is running ");
        });
    }
    public static void go(Person p) {
        p.run();
    }
}

