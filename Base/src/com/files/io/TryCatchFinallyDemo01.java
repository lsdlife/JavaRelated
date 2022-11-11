package com.files.io;

import java.io.*;

/**
 * try-catch-finally释放资源
 */
public class TryCatchFinallyDemo01 {
    public static void main(String[] args) {

        //写这里为了保证finally里面的不报错
        InputStream is=null;
        OutputStream os=null;

        try {
            //1.创建一个字节输入流与原视频接通
             is = new FileInputStream("C:\\Users\\23056\\Desktop\\Java\\123.mp4");

            //2.创建一个字节输出流与目标文件接通
             os = new FileOutputStream("C:\\Users\\23056\\Videos\\Captures\\new.mp4");

            //3.转换成字节数组
            byte buffer[] = new byte[1024];
            int len;    //记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
            System.out.println(10/0);



        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //无论代码是否正常结束，还是出现异常都要最后执行这里。
            //System.out.println("finally执行");

            //4.关闭流
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
