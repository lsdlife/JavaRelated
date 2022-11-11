package com.reflect_class;

/**
 * 反射第一步，获取Class类对象
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.Class类中的一个静态方法 forName
        Class c = Class.forName("com.reflect_class.Student");
        System.out.println(c);

        //2.类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        //3.对象.getClass() 获取对象对应类的Class对象
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);

    }
}
