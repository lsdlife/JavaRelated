package com.files.file;

import java.io.File;

/**
 * 创建File对象定位操作系统的文件
 */

public class FileDemo01 {
    public static void main(String[] args) {
        //1.创建File对象(制定了文件路径）
        //File f =new File("C:\\Users\\23056\\Desktop\\2022\\123.jpg");
        // File f =new File("C:/Users/23056/Desktop/2022/123.jpg");
        //File.Separator
        File f = new File("C:" + File.separator + "Users/23056/Desktop/2022/123.jpg");

        //文件的字节大小
        long size = f.length();
        System.out.println(size);
        //2.FIle创建对象，支持绝对路径和相对路径
        //绝对路径
        File f1 = new File("D:\\IDEAProject\\day01\\FileDemo\\src\\data.txt");
        long size1 = f1.length();
        System.out.println(size1);
        //定位模块中的文件
        //相对路径
        File f2 = new File("FileDemo/src/data.txt");
        long size2 = f2.length();
        System.out.println(size2);
        //文件夹是拿不到size()
    }
}
