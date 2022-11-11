package com.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("程序开始...ʼ");
        praseTime("2011-11-11 11:11:11");
        System.out.println("程序结束");

    }


    public static void praseTime(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(date);

    }
}
