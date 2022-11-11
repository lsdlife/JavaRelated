package com.annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 完成注解的解析
 */
public class AnnotationDemo3 {
    @Test
    public void parseClass() {
        //a.先得到类对象
        Class c = BookStore.class;
        //b.判断这个类上面是否存在注解
        if (c.isAnnotationPresent(Book.class)) {
            //c.直接获取该注解对象
            Book bo = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(bo.value());
            System.out.println(bo.price());
            System.out.println(Arrays.toString(bo.author()));
        }
    }


    @Test
    public void parseMethod() throws Exception {
        //a.先得到类对象
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        //b.判断这个类上面是否存在注解
        if (m.isAnnotationPresent(Book.class)) {
            //c.直接获取该注解对象
            Book bo = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(bo.value());
            System.out.println(bo.price());
            System.out.println(Arrays.toString(bo.author()));

        }
    }
}


@Book(value = "寻秦记", price = 99.9, author = {"小李，小王"})
class BookStore {

    @Book(value = "三少爷的剑", price = 399, author = {"古龙，熊耀华"})
    public void test() {

    }
}