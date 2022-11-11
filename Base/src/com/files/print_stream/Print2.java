package com.files.print_stream;

import java.io.PrintStream;

/**
 * 输出语句重定向
 */
public class Print2 {
    public static void main(String[] args) throws Exception {
        System.out.println("锦瑟无端五十弦");
        System.out.println("一线一柱思华年");

        //改变输出语句的位置（重定向）
        PrintStream ps=new
                PrintStream("FileDemo\\src\\com\\PrintStream\\log.txt");
        //把系统打印流改成自己的打印流,更改之后立即生效
        System.setOut(ps);

        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}
