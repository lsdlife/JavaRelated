package com.files.io;


import java.io.FileOutputStream;
import java.io.OutputStream;


/**
 *文件字节输出流
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //1.创建文件字节输出流管道
        //会清空原有的数据，再写新数据，覆盖
        //OutputStream os=new FileOutputStream("FileDemo\\src\\com\\IO\\out.txt");

        //追加
        OutputStream os=new FileOutputStream("FileDemo\\src\\com\\IO\\out.txt",true);


        //2.写数据(写一个字节）
        os.write('a');
        os.write(98);
        os.write('李');

        //写数据必须刷新数据
        os.flush();     //刷新之后可以继续使用

        //换行
        os.write("\r\n".getBytes());


        //3.写数据（一个字节数组）
        byte buffer[]= {'a',97,98,99};
        os.write(buffer);
        os.write("\r\n".getBytes());

        byte buffer2[]="我是中国人".getBytes();      //转成字节数组
        os.write(buffer2);
        os.write("\r\n".getBytes());


        //4.写字节数组的一部分
        byte buffer3[]={'1','2','3','4'};
        os.write(buffer3,0,2);
        os.write("\r\n".getBytes());


        os.close();     //包含刷新，关闭之后不可以使用
    }
}
