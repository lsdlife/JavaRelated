package com.files.io;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 文件字节输入流；每次读取一个字节数组
 */

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("FileDemo\\src\\data02.txt");
        // 2.定义一个字节数组用于接收数据
        byte buffer[] = new byte[3];
        int len = is.read(buffer);
        System.out.println("读取了：" + len + "个字节");
        // 解码
        String rs = new String(buffer);
        System.out.println(rs);

        int len1 = is.read(buffer);
        System.out.println("读取了：" + len1 + "个字节");
        String rs1 = new String(buffer);
        System.out.println(rs1);

        int len2 = is.read(buffer);
        System.out.println("读取了：" + len2 + "个字节");
        String rs2 = new String(buffer);
        System.out.println(rs2);        //cdc  cd替换ab，第三滴水还在

//        int len2=is.read(buffer);
//        System.out.println("读取了：" + len2 + "个字节");
//        //读取多少，倒出多少
//        String rs2=new String(buffer,0,len2);
//        System.out.println(rs2);

        //3.循环进行读取，每次读取一个字节数组
//        byte buffer[]=new byte[3];
//        int len;        //记录每次读取的字节数
//        while((len=is.read(buffer))>0){
//            System.out.print(new String(buffer, 0, len));
//        }
    }
}
