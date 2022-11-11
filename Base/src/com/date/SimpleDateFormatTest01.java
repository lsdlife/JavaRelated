package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期的简单格式化
 */

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println("---------------");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        //1. format(Date d)
        String s=sdf.format(d);
        System.out.println(s);


        System.out.println("-----------------");
        long time1=System.currentTimeMillis()+121*1000;
        //2. format(Object time)
        String s2=sdf.format(time1);
        System.out.println(s2);
    }


}
