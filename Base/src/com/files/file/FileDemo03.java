package com.files.file;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f=new File("FileDemo/src/data.txt");
        //创建新文件，创建成功则返回true,反之不需要这个
        System.out.println(f.createNewFile());
        File f2=new File("FileDemo/src/data02.txt");
        System.out.println(f2.createNewFile());     //几乎不用，以后创建文件是自动的

        File f3=new File("D:/FileDemo03Test/aaa");
        //如果有FileDemo03Test才会创建aaa文件夹

        //mkdir创建一级文件夹（一级是不算已经存在的那个文件夹）
        System.out.println(f3.mkdir());

        //创建多级文件夹
        File f4=new File("D:/FileDemo03Test/aaa/bbb/ccc");
        System.out.println(f4.mkdirs());


        System.out.println("-------------");

        //删除文件或空文件夹
        File f5=new File("D:/FileDemo03Test/aaa/bbb/data01.txt");
        System.out.println(f5.delete());  //占用一样可以删除
        System.out.println(f4.delete());    //删最后一级文件夹

        //只能删除非空文件夹，如果非空，false
        File f6=new File("D:/FileDemo03Test/aaa/bbb");
        System.out.println(f6.delete());


    }
}
