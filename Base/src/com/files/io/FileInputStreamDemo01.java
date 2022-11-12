package com.files.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 文件字节输入流：每次读取一个字节
 */

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream(new File("FileDemo\\src\\data.txt"));
        // 2.读取一个字节返回(每次读取水滴）
        /**  int b1=is.read();
         System.out.println((char)b1);       //97,a
         */
        // 3.使用循环
        // 定义一个变量，记录每次读取的字节
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
    }
}
