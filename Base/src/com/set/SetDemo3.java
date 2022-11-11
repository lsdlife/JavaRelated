package com.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：观察对值的数据如何排序，学会对自定义数据的排序
 */
public class SetDemo3 {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();    //不重复，无索引，可排序
        set.add("aaa");
        set.add("aaa");
        set.add("ddd");
        set.add("ccc");
        System.out.println(set);


        //对数字排序
        Set<Integer> set1=new TreeSet<>();    //不重复，无索引，可排序
        set1.add(111);
        set1.add(3333);
        set1.add(666);
        set1.add(555);
        System.out.println(set1);

    }
}
