package com.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合，
 * 要求：学生对象的成员变量值相同，我们就认为是同一个对象。
 *
 */
public class StdHashExp {
    public static void main(String[] args) {
        Set<Student> stuset=new HashSet<>();
        Student s1=new Student("张三",21);
        Student s2=new Student("张三",21);
        Student s3=new Student("王五",20);
        stuset.add(s1);
        stuset.add(s2);
        stuset.add(s3);
        System.out.println(stuset);

       //因为重写了哈希值的计算方法，所以算出来一样。默认的方法是不一样的。
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }



}
