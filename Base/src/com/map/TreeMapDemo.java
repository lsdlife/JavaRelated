package com.map;

import com.set.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        System.out.println("TreeMap自己的排序");
        Map<Integer,String > maptest1=new TreeMap<>();
        maptest1.put(12,"张三");
        maptest1.put(10,"李四");
        maptest1.put(20,"王五");
        System.out.println(maptest1);

        System.out.println("--------------------");


        //自定义排序规则，按价格降序
        Map<Apple,String> mapdemo=new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o2.getPrice()-o1.getPrice();     //按价格降序
            }
        });
        mapdemo.put(new Apple("红苹果",20),"江西");
        mapdemo.put(new Apple("黄苹果",25),"河北");
        mapdemo.put(new Apple("青苹果",10),"广西");

        //按价格升序
        System.out.println(mapdemo);

    }
}
