package com.date;

import java.util.Calendar;
import java.util.Date;

/**
 * 简单的获取日历对象
 */

public class CalendarDemo {
    public static void main(String[] args) {
        //1.拿到日历对象
        Calendar ca= Calendar.getInstance();
        System.out.println(ca);

        //2.获取日历的信息 public int ger(int field)
        System.out.println(ca.get(Calendar.YEAR));

        //3.public void set(int field,int value)
        // ca.set(Calendar.HOUR,12);

        //4.public void add(int field,int amount)
        //ca.add(Calendar.DAY_OF_YEAR,64);

        //5.public final Date getTime();    //拿到此刻日期对象
        Date d=ca.getTime();

        //6.public long getTimeInMills();   //拿到此刻时间毫秒值
        //long time =ca.getTimeInMillis();


    }
}
