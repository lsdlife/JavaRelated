package com.string;

import java.util.Arrays;

public class StringApiTest {
    static String s = "aa:bb@cc/dd!ee"; //
    public static void main(String[] args) {
        //StringApiTest sp=new StringApiTest();

        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toCharArray());

        //1.split可以按空格分开，可以按特定字符分开，
        //2.多个标记分开
        String aa[] = s.split("\\:|@|/|!");   //[aa, bb, cc, dd, ee]
        System.out.println(Arrays.toString(aa));
        //3.split中的limit
        String s3 = "广东 广州 万象城大街 科技大厦 天河";
        String rs[] = s3.split(" ", 3);    //里面是空格，非空格的话是第一个就拆
        System.out.println(Arrays.toString(rs));

        System.out.println("======");
        System.out.println(s.substring(1, 4));   //左闭右开
        System.out.println(s.replace('c', 'a'));
    }
}
