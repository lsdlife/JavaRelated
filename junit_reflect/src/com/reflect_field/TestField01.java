package com.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;


public class TestField01 {

    //1.获取全部的成员变量
    // Field []     getDeclaredFields();
    //获取所有的成员变量对应的Field对象，只要申明了就可以得到
    @Test
    public void getDeclaredFields() {
        //a.定位Class对象
        Class c = Student.class;
        //b.定位全部成员变量
        Field fields[] = c.getDeclaredFields();

        //c.遍历一下
        for (Field field : fields) {
            System.out.println(field.getName() + "==>" + field.getType());
        }
    }


    //2.获取某个成员变量对象Field  getDeclared(String name)
    @Test
    public void getDeclaredField() throws Exception {
        //a.定位Class对象
        Class c = Student.class;
        //b.根据名称定位某个成员变量
        Field f = c.getDeclaredField("age");
        System.out.println(f.getName() + "==>" + f.getType());

    }


}
