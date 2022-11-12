package com.files.file;

import java.io.File;

/**
 * 遍历文件夹
 */

public class FileDemo04 {
    public static void main(String[] args) {
        //1.定位一个目录
        File f1 = new File("D:/FileDemo03Test");
        String names[] = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        //2.一级文件对象
        //获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File files[] = f1.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("--------");
        //空文件时返回0
        File f2 = new File("D:/FileDemo04Test");
        File files2[] = f2.listFiles();
        System.out.println(files2.length);
    }
}
