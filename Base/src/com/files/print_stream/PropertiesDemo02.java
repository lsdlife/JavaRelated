package com.files.print_stream;


import java.io.FileReader;
import java.util.Properties;

//properties读取文件属性中的键值对信息

public class PropertiesDemo02 {

    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        System.out.println(properties);

        //加载属性文件中的键值对数据到属性对象中去
        properties.load(new FileReader("FileDemo\\src\\com\\Print\\users.properties"));

        System.out.println(properties);

        String rs=properties.getProperty("lsd");


    }
}
