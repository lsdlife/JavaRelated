package com.string;

/**
 * String常见面试的坑
 * <p>
 * //System.identityHashCode(s)打印对象地址
 */

public class StringDemo01 {
    public static void main(String[] args) {
        //这里是创建两个对象，对象"abc"存放在常量池中，每次new String()都会创建一个对象s在堆内存中
        String s = new String("abc");

        //这里只创建一个字符串对象"abc" ,存放在常量池中
        String s1 = "abc";
        System.out.println("s==s1:" + s == s1);     //false
        String s2 = "a";
        String s3 = s2 + "b" + "c";   //编译时候不能确定下来，不能引用常量池对象

        System.out.println(s1.equals(s3));    //true  编译器的优化
        System.out.println(s1 == s3);     //false  比较的是对象地址

        //下面这两个地址不一样
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s3));
    }
}
