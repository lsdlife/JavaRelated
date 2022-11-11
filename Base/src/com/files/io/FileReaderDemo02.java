package com.files.io;

import java.io.FileReader;
import java.io.Reader;

//文件字符输入流：一次读取一个字符数组

public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字符输入流管道与源文件接通
        Reader fr=new FileReader("FileDemo\\src\\com\\IO\\test02.txt");

        //2.使用一个字符数组
        //循环每次读取一个字符数组的数据
        char buffer[]=new char[1024];   //1k
        int len;
        while ((len = fr.read(buffer)) != -1) {     //记得要加buffer
            String rs=new String(buffer,0,len);
            System.out.println(rs);
        }

    }
}
