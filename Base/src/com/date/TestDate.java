package com.date;

import java.util.Date;

/**
 * Date类的方法
 */
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();      //系统此刻时间
        System.out.println(d);

        long time = d.getTime();
        System.out.println(d.getTime());    //1970年1月1日  00:00:00走到此刻的总毫秒数

        System.out.println("===========");
        Date d2 = new Date(time);
        System.out.println(d2);

//        Date d3=new Date();
//        d3.setTime(time);
//        System.out.println(d3);
    }
}
