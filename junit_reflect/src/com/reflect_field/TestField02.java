package com.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField02 {
    @Test
    public void getDeclaredField() throws Exception {
        //a.定位Class对象
        Class c = Student.class;
        //b.根据名称定位某个成员变量
        Field fage = c.getDeclaredField("age");

        fage.setAccessible(true);

        //c.赋值
        Student s = new Student();
        fage.set(s, 18);     //s.setAge(18)
        System.out.println(s);

        //取值
        int age = (int) fage.get(s);
        System.out.println(age);


    }
}
