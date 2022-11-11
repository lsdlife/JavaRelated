package com.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串解析案例：
 * 1.学会SimpleDateFormat时间解析字符串时间称为日期对象
 * 2.有一个时间2021年08年06日 11:11:11往后2天14小时49分06秒后的时间是多少
 */


public class SimpleDateFormatTest02 {
    public static void main(String[] args) throws ParseException {
        String dateStr="2021年08月06日 11:11:11";
        //字符串解析
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d=sdf.parse(dateStr);
        //System.out.println(d);

        long time=d.getTime()+(2*24*60*60+14*60*60+49*60+06)*1000;
        System.out.println(  sdf.format(time));

    }
}
