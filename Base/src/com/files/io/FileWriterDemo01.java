package com.files.io;

import java.io.FileWriter;
import java.io.Writer;

//文件字符输出流：按字符的形式写数据出去

public class FileWriterDemo01 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字符输出流数组与源文件接通
        //覆盖管道
        //Writer fw=new FileWriter("FileDemo\\src\\com\\IO\\test02.txt");
        //追加管道
        Writer fw = new FileWriter("FileDemo\\src\\com\\IO\\test02.txt", true);


        //2.写一个字符出去
        fw.write('a');
        fw.write('李');  //不会乱码
        fw.write("\r\n");

        //3.写一个字符串出去
        fw.write("我是中国人");
        fw.write("\r\n");


        //4.写一个字符数组出去
        char char1[] = "我是江西人".toCharArray();
        fw.write(char1);
        fw.write("\r\n");


        //5.写字符串的一部分出去
        fw.write("abc我是赣州人", 0, 3);
        fw.write("\r\n");


        //4.写字符数组的一部分出去
        char char2[] = "abc我是赣县区的人".toCharArray();
        fw.write(char2, 5, 5);
        fw.write("\r\n");

        fw.flush();
        fw.close();     //关闭包含刷新


    }
}
