package com.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent01 {

    //1.getConstructors;
    //获取全部的构造器，只能获取public修饰的构造器
    //Constructor[] getConstructors()
    @Test
    public void getConstructors() {
        //a.第一步，获取类对象
        Class c = Student.class;
        //b.提取类中的全部的构造器对象(只能拿公开权限的）
        Constructor constructors[] = c.getConstructors();
        //c.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "->" + constructor.getParameterCount());
        }
    }


    //2.getDeclaredConstructors();
    //获取全部的构造器，只要你感谢，这里就能拿到，无所谓权限是否可及
    @Test
    public void getDeclaredConstructors() {
        //a.第一步，获取类对象
        Class c = Student.class;
        //b.提取类中的全部的构造器对象
        Constructor constructors[] = c.getDeclaredConstructors();
        //c.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "->" + constructor.getParameterCount());
        }
    }

    //3.getConstructor(Class ...parameterTypes)
    //获取某个构造器，只能拿public修饰的某个构造器
    @Test
    public void getConstructor() throws Exception {
        //a.第一步，获取类对象
        Class c = Student.class;
        //b.定位单个构造器对象（按照参数定位无参数构造器),只能拿公开的
        Constructor co = c.getConstructor();
        System.out.println(co.getName() + "->" + co.getParameterCount());
    }


    //4.getDeclaredConstructor
    //获取某个构造器，只要你敢写，这里就能拿到，无所谓权限是否可及
    @Test
    public void getDeclaredConstructor() throws Exception {
        //a.第一步，获取类对象
        Class c = Student.class;
        //b.定位单个构造器对象（按照参数定位无参数构造器),私有的也可以拿到
        Constructor co = c.getDeclaredConstructor();
        System.out.println(co.getName() + "==>" + co.getParameterCount());
        //c.定位某个有参构造器，可以拿私有的
        Constructor co1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(co1.getName() + "->" + co1.getParameterCount());
    }
}
