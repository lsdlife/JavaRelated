package com.files.io;

import java.io.*;

/**
 * 字节流案例：文件拷贝
 * 学会使用字节流完成文件的复制（支持一切文件类型的复制）
 */

public class CopyDemo05 {
    public static void main(String[] args) {
        //1.创建一个字节输入流与原视频接通
        try {
            InputStream is = new FileInputStream("C:\\Users\\23056\\Desktop\\Java\\123.mp4");
            //2.创建一个字节输出流与目标文件接通
            OutputStream os = new FileOutputStream("C:\\Users\\23056\\Videos\\Captures\\new.mp4");
            //3.转换成字节数组
            byte buffer[] = new byte[1024];
            int len;    //记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
            //4.关闭流
            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
