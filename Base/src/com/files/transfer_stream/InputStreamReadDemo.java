package com.files.transfer_stream;

import java.io.*;

//字节转换输入流：可以把原始的字节输入流按照指定编码转换成字节输入流

public class InputStreamReadDemo {

    public static void main(String[] args) throws Exception {
        //1.提取GBK文件的原始字节流
        InputStream is=new FileInputStream("C:\\Users\\23056\\Desktop\\data.txt");  //GBk文件

        //2.把原始字节流转换成字符输入流

        //默认以utf-8的方式转换成字符流,还是乱码和FileReader一样，如果不指定的话。
        // Reader r=new InputStreamReader(is);

        //完美,多态写法
        //InputStreamReader包InputStream，Reader包InputStreamReader
        Reader r=new InputStreamReader(is,"GBK");

        //3.把低级的字节输入流包装成高级的缓冲输入流
        //BufferedReader包Reader
        BufferedReader brs=new BufferedReader(r);

        //再按行读取
        String line;
        while((line=brs.readLine())!=null){
            System.out.println(line);
        }
    }


}
