package com.files.io;

import java.util.Arrays;

/**
 * 文字的编码解码
 */

public class IOCharSet {
    public static void main(String[] args) throws Exception {
        // 1.编码，把文字转换成字节（使用指定的编码)
        String names = "abc我爱你中国";
        System.out.println(names);
        byte bytes[] = names.getBytes();      //电脑默认是UFT-8
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2.解码：把字节专场对应的中文形式(编码前和编码后的字符集必须一致，否则乱码)
        String rs = new String(bytes, "UTF-8");
        // String rs=new String(bytes,"GBK");        //乱码
        System.out.println(rs);
    }
}
