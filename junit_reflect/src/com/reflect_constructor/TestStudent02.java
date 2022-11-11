package com.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

//拿到类的构造器然后创建类对象

public class TestStudent02 {
    //1.调用构造器得到一个类的对象返回
    @Test
    public void getDeclaredConstructor() throws Exception {
        //a.第一步，获取类对象
        Class c = Student.class;
        //b.定位单个构造器对象（按照参数定位无参数构造器),私有的也可以拿到
        Constructor co = c.getDeclaredConstructor();
        System.out.println(co.getName() + "==>" + co.getParameterCount());

        //如果用到私有的构造器，创建实例会报错可以用暴力反射
        co.setAccessible(true); //这一次打开
        Student s = (Student) co.newInstance();
        System.out.println(s);

        System.out.println("----------");

        //c.定位某个有参构造器，可以拿私有的
        Constructor co1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(co1.getName() + "->" + co1.getParameterCount());
        co1.setAccessible(true);
        //根据指定的构造器创建对象
        Student s1 = (Student) co1.newInstance("lsd", 29);
        System.out.println(s1);

    }
}
