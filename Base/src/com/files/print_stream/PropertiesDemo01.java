package com.files.print_stream;

import java.io.FileWriter;
import java.util.Properties;

/**
 * Properties的API
 */

public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception {
        //使用Properties把键值对信息存入到属性文件中
        Properties properties = new Properties();
        //会去重
        properties.setProperty("admin", "123456");
        properties.setProperty("admin", "123456");
        properties.setProperty("lsd", "123111");
        properties.setProperty("ln", "1111");
        System.out.println(properties);
        //参数一：保存管道，字符输出流管道
        //参数二：保存心得
        properties.store(
                new FileWriter("FileDemo\\src\\com\\PrintStream\\users.properties"), "this is a comment");
    }
}
