package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 目标：收集Stream流到集合中去
 */

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("张三丰");
        list1.add("张无忌");
        list1.add("赵敏");
        list1.add("周芷若");
        list1.add("张强");

        //Stream流转成list集合
        Stream<String> stream = list1.stream().filter(s -> s.startsWith("张"));
        List<String> l1 = stream.collect(Collectors.toList());
        System.out.println(l1);

        //注意：流只能使用一次

        //Stream流转成Set集合
        Stream<String> stream2 = list1.stream().filter(s -> s.startsWith("张"));
        Set<String> s1 = stream2.collect(Collectors.toSet());
        System.out.println(s1);

        Stream<String> stream3 = list1.stream().filter(s -> s.startsWith("张"));
        //Object[] arr = stream3.toArray();
        // String arrs[]= stream3.toArray(String[]::new);
        //stream3.toList();
    }
}
