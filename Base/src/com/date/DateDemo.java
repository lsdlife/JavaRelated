package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间解析以及比较
 */

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //1.开始时间和结束时间
        String startTime="2020年11月11日 0:0:0";
        String endTime="2020年11月11日 0:10:0";

        //2.小明和小佳
        String xiaoming="2021年11月11日 00:03:47";
        String xiaojia="2021年11月11日 00:10:11";

        //3.解析他们的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(startTime);
        Date d2=sdf.parse(endTime);
        Date d3=sdf.parse(xiaoming);
        Date d4=sdf.parse(xiaojia);

        if(d3.after(d1)&&d3.before(d2)){
            System.out.println("小明秒杀成功");
        }else{
            System.out.println("小明秒杀失败");
        }




    }



}
