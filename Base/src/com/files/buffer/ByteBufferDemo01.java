package com.files.buffer;

import java.io.*;

/**
 * 字节缓冲输入流和字节缓冲输出流的使用
 */

public class ByteBufferDemo01 {
    public static void main(String[] args) {
        //jdk7写法
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream("FileDemo\\src\\com\\Buffer\\test01.txt");
                //a.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                //2.创建一个字节输出流与目标文件接通
                OutputStream os = new FileOutputStream("FileDemo\\src\\com\\Buffer\\test02.txt");
                //b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            //3.定义一个字节数组转移数据
            byte buffer[] = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
