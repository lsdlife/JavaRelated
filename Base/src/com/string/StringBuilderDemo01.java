package com.string;

public class StringBuilderDemo01 {
    public static void main(String[] args) {

        String s1="abc";        //只创建一个字符串对象"abc" ,存放在常量池中
        String s3="a";
        String s2=s3+"b"+"c";


        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("abc");   //
        System.out.println(stringBuilder.toString().equals(s1));     //false 一个是流，一个是普通字符串
        System.out.println(stringBuilder.toString().equals(s1));     //true  内容一样
        System.out.println(stringBuilder.toString().equals(s2));    //true  内容一样

        System.out.println(stringBuilder);

        System.out.println("=============");
    }
}
