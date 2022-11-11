package com.files.buffer;

import java.io.*;


/**
 * 缓冲字符输出流的使用，
 * 新增换行功能：newLine();
 */
public class BufferWriterDemo01 {
    public static void main(String[] args) throws Exception {

        //1.创建一个字符输出流数组与源文件接通
        //追加管道
        Writer wr = new FileWriter("FileDemo\\src\\com\\Buffer\\test03.txt", true);
        //a.把低级的字符输入流包装成缓冲输入流

        BufferedWriter bw = new BufferedWriter(wr);

        //2.写一个字符出去
        bw.write('a');
        bw.write('李');  //不会乱码
        bw.newLine();   //br.write("\r\n");

        //3.写一个字符串出去
        bw.write("我是中国人");
        bw.newLine();

        //4.写一个字符数组出去
        char char1[] = "我是江西人".toCharArray();
        bw.write(char1);
        bw.newLine();


        //5.写字符串的一部分出去
        bw.write("abc我是赣州人", 0, 3);
        bw.newLine();


        //写字符数组的一部分出去
        char char2[] = "abc我是赣县区的人".toCharArray();
        bw.write(char2, 5, 5);
        bw.newLine();

        System.out.println("写文件完成！");

        bw.flush();
        bw.close();     //关闭包含刷新

    }
}
