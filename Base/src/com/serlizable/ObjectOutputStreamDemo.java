package com.serlizable;

import java.io.*;

/**
 * 序列化对象输出流
 */

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //1.创建学生对象
        Student s = new Student("王宝强", "wangbaoqiang", 25);

        //2.对象序列化，包装低级字节输出流
        //使用的流是对象字节输出流 ObjectOutputStream.
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("FileDemo\\src\\com\\Serlizable\\data1.txt"));

        //3.调用序列化方法
        oos.writeObject(s);

        //4.释放资源
        oos.close();
    }
}
