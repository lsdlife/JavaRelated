package com.files.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//文件字节输入流：读取文件的全部字节


/**
 * 一次读取全部字节，可以解决中文乱码问题
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("FileDemo\\src\\data02.txt");

        //2.定义一个字节数组和文件一样大
        File f=new File("FileDemo\\src\\data02.txt");
        byte buffer[]=new byte[(char)f.length()] ;

        int len= is.read(buffer);
        System.out.println("读取了多少个字节：" + len);
        System.out.println("文件大小: " + f.length());
        System.out.println(new String(buffer, 0, len));

        //is.readAllBytes();


    }
}
