package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //1.创建一个ArrayList对象
        //List：有序，可重复，有索引。
        //一行经典代码
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("mysql");
        list.add("mysql");


        //2.在某个索引位置插入元素
        list.add(2,"html");

        //3.根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //3.根据索引获取元素 ：public get(int index) 返沪集合中指定位置的元素
        System.out.println(list.get(2));


        //5.修改索引位置的元素：public E set(int index,E elment)
        //返回修改前的数据
        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);


        list.clear();

    }
}
