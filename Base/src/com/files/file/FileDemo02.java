package com.files.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo02 {
    public static void main(String[] args) {
        File f = new File("C:/Users/23056/Desktop/2022/123.jpg");
        //获取绝对路径
        System.out.println(f.getAbsolutePath());
        //获取文件定义时候使用的路径
        System.out.println(f.getPath());
        //获取文件的名称，带后缀
        System.out.println(f.getName());
        //获取文件的大小，字节个数
        System.out.println(f.length());
        //获取文件的最后修改时间
        long time = f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        System.out.println(f.isFile());

        System.out.println("-----------------------------------");

        File f2 = new File("FileDemo/src/data.txt");
        System.out.println(f2.getAbsolutePath());
        //获取文件定义时候使用的路径
        System.out.println(f2.getPath());
        //获取文件的名称，带后缀
        System.out.println(f2.getName());
        //获取文件的大小，字节个数
        System.out.println(f2.length());
        //获取文件的最后修改时间
        long time2 = f2.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time2));
        System.out.println(f2.isFile());
    }
}
