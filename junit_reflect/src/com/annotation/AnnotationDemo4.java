package com.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    //@MyTest
    public void test1() {
        System.out.println("方法测试1");
    }


    public void test2() {
        System.out.println("方法测试2");
    }


    @MyTest
    public void test3() {
        System.out.println("方法测试3");
    }


    /**
     * 启动菜单:有注解的才被调用
     */
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 a4 = new AnnotationDemo4();

        //a.获取类对象
        Class c = AnnotationDemo4.class;
        //b.提取全部方法
        Method[] methods = c.getDeclaredMethods();

        //c.遍历方法看是否有MyTest注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                //运行
                method.invoke(a4);
            }
        }

    }


}
