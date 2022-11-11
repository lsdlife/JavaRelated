package com.files.buffer;

import java.io.*;

/**
 * 学会使用缓冲字符输入流，
 * 新增按照行读取的方法（经典代码）
 */
public class BufferReadDemo01 {
    public static void main(String[] args) {

        try (
                //1.创建一个字符输入流管道与源文件接通
                Reader fr = new FileReader("FileDemo\\src\\com\\Buffer\\test03.txt");
                //a.把低级的字符输入流包装成缓冲输入流
                BufferedReader br = new BufferedReader(fr);
        ) {

//            //2.用循环
//            char buffer[] = new char[1024];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                String rs = new String(buffer, 0, len);
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(br.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
