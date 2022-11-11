package com.framework;

//目标：提供一个同样框架，保存所有对象的通用信息
public class FrameWork {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("lsd");
        s.setClassName("92");
        s.setSex('男');
        s.setAge(24);
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setAge(29);
        t.setName("wb");
        t.setSalary(12000);
        MybatisUtil.save(s);

    }
}
