package com.reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

public class TestMethod01 {
    @Test
    public void getDeclaredMethods() {
        //a.获取类对象
        Class c = Dog.class;
        //b.提取全部方法，包括私有的
        Method methods[] = c.getDeclaredMethods();

        //c.遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName() + "==>" + method.getReturnType());
        }
    }


    @Test
    public void getDeclaredMethod() throws Exception {
        //a.获取类对象
        Class c = Dog.class;
        //b.提取单个方法对象,里面带方法名
        Method m1 = c.getDeclaredMethod("eat");
        Method m2 = c.getDeclaredMethod("eat", String.class);

        //因为方法是私有的,暴力打开权限
        m1.setAccessible(true);

        //c.触发方法的执行
        Dog d = new Dog();
        //注意：方法如果是没有结果回来，那么返回的是null
        Object result = m1.invoke(d);
        System.out.println(result);


        m2.setAccessible(true);
        Object result2 = m2.invoke(d, "骨头");
        System.out.println(result2);
    }
}
