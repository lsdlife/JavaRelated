package com.reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //需求，反射实现泛型擦除后，加入其他类型的元素
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());

        System.out.println(list1.getClass() == list2.getClass()); //ArrayList.class


        System.out.println("==============");
        ArrayList<Integer> list3 = new ArrayList<>();


        list3.add(200);
        //list3.add("黑马");
        Class c = list3.getClass();   //ArrayList.class=》 public boolean add(E e)
        //定位c类的add方法
        Method d = c.getDeclaredMethod("add", Object.class);

        boolean b = (boolean) d.invoke(list3, "黑马");

        System.out.println(b);
        System.out.println(list3);


    }
}
