package com.framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

//反射做通用框架

public class MybatisUtil {
    //通用

    /**
     * 保存任意类型的对象
     *
     * @param obj
     */

    public static void save(Object obj) {
        try (
                PrintStream ps = new PrintStream(
                        new FileOutputStream("junitReflect/src/com/framework"), true);
        ) {

            //1.提取这个对象的所有成员变量
            Class c = obj.getClass();

            ps.println("==========" + c.getSimpleName() + "===========");  //c.getSimpleName()获取当前类名   c.getName(获取全限名：包名+类名


            //2.提取全部成员变量
            Field fileds[] = c.getDeclaredFields();
            //3.获取全部成员变量
            for (Field filed : fileds) {
                String name = filed.getName();
                filed.setAccessible(true);
                //提取本成员变量在obj对象的值（取值）
                String value = filed.get(obj) + "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
