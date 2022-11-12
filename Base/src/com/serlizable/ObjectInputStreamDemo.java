package com.serlizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 学会对象反序列化，
 * 使用对象字节输入流把文件中的对象数据恢复到内存中
 */

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        //1.创建对象字节输入流，包装低级字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IDEAProject\\day01\\FileDemo\\src\\com\\Serlizable\\data1.txt"));

        //2.调用字节输入流的读对象方法
        Student s2 = (Student) ois.readObject();
        System.out.println(s2);
    }
}
