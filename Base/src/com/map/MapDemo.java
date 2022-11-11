package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 *   Map集合的遍历方式：3种
 */
public class MapDemo {
    public static void main(String[] args) {
        //一行经典代码
        Map<String, Integer> maps = new HashMap<>();
        maps.put("aaa", 2);
        maps.put("ttt", 1);
        maps.put("www", 3);

        System.out.println(maps);
        System.out.println("--------------");


//        //1.键找值
//        Set<String> keys = maps.keySet();   //拿到全部键集合
//        for (String key : keys) {
//            int value = maps.get(key);    //不能写keys，会空指针异常
//            System.out.println(key + "==" + value);
//        }

        //ctrl +alt+v 自动补全


//        //2.键值对集合
//        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            String key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println(key + "==>" + value);
//        }


//        //3.lambda表达式遍历Map集合
//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "==>" + value);
//            }
//        });

        maps.forEach((key, value) -> System.out.println(key + "==>" + value));


//        System.out.println("-------------");
//
//        //直接找全部值
//        Collection<Integer> values = maps.values();
//        System.out.println(maps.values());


    }
}
