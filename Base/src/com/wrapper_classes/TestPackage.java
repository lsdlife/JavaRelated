package com.wrapper_classes;

/**
 * 包装类
 */
public class TestPackage {
    public static void main(String[] args) {

        int a=10;
        Integer a1=a;       //自动装箱
        System.out.println(a1);

        Integer a2=12;
        int a3=a2;
        System.out.println(a3);

        System.out.println("==================");

        int b=Integer.parseInt("200");
        System.out.println(b);
        double b1=Double.parseDouble("20.3");
        System.out.println(b1);
    }
}
