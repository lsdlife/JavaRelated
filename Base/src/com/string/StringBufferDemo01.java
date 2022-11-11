package com.string;
/**
 * 认识StringBuffer
 * 1.StringBuffer()构造一个空的字符串缓冲区，并且初始化为16个字符的容量
 * 2.StringBuffer(int length) 创建一个空的字符串缓冲区，并且初始化为指定长度length的容量
 * 3.StringBuffer(String str) 创建一个字符串缓冲区，并将其内容初始化为指定的字符串内容str,
 * 字符串缓冲区的初始内容为16加上字符串str的长度
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {

        // 定义一个空的字符串缓冲区，含有16个字符的容量
        StringBuffer str1 = new StringBuffer();

        // 定义一个含有10个字符容量的字符串缓冲区
        StringBuffer str2 = new StringBuffer(10);

        // 定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
        StringBuffer str3 = new StringBuffer("青春无悔");
        /*
         *输出字符串的容量大小
         *capacity()方法返回字符串的容量大小
         */
        System.out.println(str1.capacity());    // 输出 16
        System.out.println(str2.capacity());    // 输出 10
        System.out.println(str3.capacity());    // 输出 20

        System.out.println("==============");
        // 创建一个 StringBuffer 对象
        StringBuffer buffer = new StringBuffer("hello,");
        String str = "World!";
        // 向 StringBuffer 对象追加 str 字符串
        buffer.append(str);
        // 输出：Hello,World!
        System.out.println(buffer.substring(0));

    }
}
