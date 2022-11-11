package com.files.transfer_stream;

import java.io.*;

//字节转换输出流：可以把原始的字节输出流按照指定编码转换成字节输出流

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        //1.定义一个字节输出流
        OutputStream os=new FileOutputStream("D:\\IDEAProject\\day01\\FileDemo\\src\\data03.txt",true);

        //2.把原始的字节输出流转换成字符输出流
        //OutputStreamWriter osr=new OutputStreamWriter(os);  //以默认utf-8格式写，和FileWriter一样

        //Writer osr=new OutputStreamWriter(os,"GBK");    //乱码
        //Writer可以包OutputStreamWriter
        Writer osr=new OutputStreamWriter(os);

        //3.把低级的字符输出流包装成高级的缓冲字符输出流。
        //BufferedWriter可以包包Writer（多态写法右边就是FileWriter）,OutputStreamWriter。
        BufferedWriter bw=new BufferedWriter(osr);

        bw.write("我爱你中国1");
        bw.write("我爱你中国2");
        bw.write("我爱你中国3");

        bw.close();
    }



}
