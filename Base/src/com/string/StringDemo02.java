package com.string;

/**
 * 编译器对String类的自动优化
 */

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "abc";    //"abc"对象存放在常量池中
        String s2 = "ab";
        String s3 = s2 + "c";    //对象+常量

        /**
         * java中使用+号拼接字符串，编译器会自动将其优化成StringBuilder的appen方法。
         */
        String s4 = "a" + "b" + "c";        //自动优化成abc
        System.out.println("s1==s3: " + s1 == s3);
        System.out.println("s1==s4: " + s1 == s4);
    }
}
