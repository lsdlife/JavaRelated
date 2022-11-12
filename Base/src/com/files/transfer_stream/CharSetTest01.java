package com.files.transfer_stream;

import java.io.*;

/**
 * 测试GBK文件按utf-8读取
 */

public class CharSetTest01 {
    // 代码编码和文件编码相同和不同的情况
    public static void main(String[] args) throws Exception {
        // jdK7的写法
        try (
                // 1.创建一个字符输入流管道与源文件接通
                Reader fr = new FileReader("C:\\Users\\23056\\Desktop\\data.txt");  //GBK文件
                // a.把低级的字符输入流包装成缓冲输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            // 2.读多少倒多少
            /*
            char buffer[] = new char[1024];
            int len;
            while ((len = br.read(buffer)) != -1) {
                String rs = new String(buffer, 0, len);     //读中文乱码
                System.out.println(rs);
            }
             */
            String line;
            while ((line = br.readLine()) != null) {
                //超过一行，读中文乱码，如果是一行，会直接null
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
