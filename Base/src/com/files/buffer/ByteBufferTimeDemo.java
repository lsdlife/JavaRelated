package com.files.buffer;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * 字节缓冲流的性能分析：
 * 使用低级的字节流按照一个一个字节的形式复制文件。
 * 使用低级的字节流按照一个一个字节数组的形式复制文件。
 * 使用高级的缓冲字节流按照一个一个字节的形式复制文件。
 * 使用高级的缓冲字节流按照一个一个字节数组的形式复制文件
 */
public class ByteBufferTimeDemo {

    private static final String SRC_FILE="C:\\Users\\23056\\Desktop\\Java\\123.mp4";
    private static final String DEST_FILE="C:\\Users\\23056\\Videos\\Captures\\";
    public static void main(String[] args) {
       // copy1();  //时间太久
        copy2();
        copy3();
        copy4();
    }

    //1. 字节流使用一个字节
    private static void copy1(){
        long startTime=System.currentTimeMillis();

        try {
            //1.创建低级的字节输入流与源文件接通。
            InputStream is=new FileInputStream(SRC_FILE);
            //2.创建低级的字节输出流与目标文件接通
            OutputStream os=new FileOutputStream(DEST_FILE+"new.mp4");

            //3.定义一个字节每次读取一个字节
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("字节流每次读取一个字节复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }

    //2. 字节流使用字节数组
    private static void copy2(){
        long startTime=System.currentTimeMillis();

        try {
            //1.创建低级的字节输入流与源文件接通。
            InputStream is=new FileInputStream(SRC_FILE);
            //2.创建低级的字节输出流与目标文件接通
            OutputStream os=new FileOutputStream(DEST_FILE+"new2.mp4");

            //3.定义一个字节每次读取一个字节
            int len;
           byte  buffer[]=new byte[1024*8];
            while (( len=is.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("字节流每次读取一个字节数组复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }


    //3.字节缓冲流使用一个字节
    private static void copy3(){
        long startTime=System.currentTimeMillis();

        try {
            //1.创建低级的字节输入流与源文件接通。
            InputStream is=new FileInputStream(SRC_FILE);
            //
            InputStream bis=new BufferedInputStream(is);
            //2.创建低级的字节输出流与目标文件接通
            OutputStream os=new FileOutputStream(DEST_FILE+"new3.mp4");
            //
            OutputStream bos=new BufferedOutputStream(os);

            //3.定义一个字节每次读取一个字节
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("缓冲字节流每次读取一个字节复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }


    //4.字节缓冲流使用字节数组
    private static void copy4(){
        long startTime=System.currentTimeMillis();

        try {
            //1.创建低级的字节输入流与源文件接通。
            InputStream is=new FileInputStream(SRC_FILE);
            //
            InputStream bis=new BufferedInputStream(is);
            //2.创建低级的字节输出流与目标文件接通
            OutputStream os=new FileOutputStream(DEST_FILE+"new4.mp4");
            //
            OutputStream bos=new BufferedOutputStream(os);
            //3.定义一个字节每次读取一个字节
            int len;
            byte  buffer[]=new byte[1024*8];
            while (( len=bis.read(buffer)) != -1) {
                bos.write(buffer,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("缓冲字节流每次读取一个字节数组复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }
}
