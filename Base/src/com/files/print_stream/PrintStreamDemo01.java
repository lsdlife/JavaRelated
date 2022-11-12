package com.files.print_stream;

import java.io.PrintWriter;

/**
 * 学会使用打印流，高效，方便写数据到文件。
 * PrintStream和PrintWriter打印数据功能是一样的，
 * PrintStream支持写字节数据
 * PrintWriter支持写字符数据
 */

public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //1.创建一个打印流对象
        //PrintStream ps=new PrintStream(new FileOutputStream("FileDemo\\src\\com\\PrintStream\\ps.txt",true));

        //true只能加在原始流管道
        // PrintStream ps=new PrintStream("FileDemo\\src\\com\\PrintStream\\ps.txt");
        PrintWriter ps = new PrintWriter("FileDemo\\src\\com\\PrintStream\\ps.txt");
        ps.println(91);
        ps.println(-1);
        ps.println("打印中文正常");
        ps.println(true);
        ps.close();
    }
}
