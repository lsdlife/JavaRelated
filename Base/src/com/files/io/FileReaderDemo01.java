package com.files.io;

import java.io.FileReader;
import java.io.Reader;

/**
 * 文件字符输入流：每次读取一个字符
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws  Exception{
        //1.创建一个字符输入流管道与源文件接通
        Reader fr=new FileReader("FileDemo\\src\\com\\IO\\test01.txt");


        //2.读取一个字符的编号。没有可读的字符返回-1
        //一个中文字符也可也读取
//        int code=fr.read();     //中文也不乱码
//        System.out.print((char) code);


        //3.使用循环继续读取
        int code;
        while((code= fr.read())!=-1){
            System.out.print((char) code);
        }


    }
}
