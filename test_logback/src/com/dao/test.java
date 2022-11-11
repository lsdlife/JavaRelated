package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//快速搭建LogBack日志框架，记录程序的执行情况到控制台/文件中。
public class test {
    //创建LogBack的日志对象，代表了日志技术
    public static final Logger LG = LoggerFactory.getLogger(test.class);

    public static void main(String[] args) {
        //
        while (true) {
            try {
                LG.debug("main方法开始执行");
                LG.info("第二行");
                int a = 10;
                int b = 0;
                LG.trace("a:" + a);
                //System.out.println(a/b);
            } catch (Exception e) {
                e.printStackTrace();
                LG.error("ERROR:" + e);
            }
        }
    }
}
