package com.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 集合获取Stream流的方式
 */

public class StreamDemo2 {
    public static void main(String[] args) {
        //Collection集合
        Collection<String> lists = new ArrayList<>();
        Stream<String> stream = lists.stream();

        Map<String, Integer> maps = new HashMap<>();
        //键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valuesStream = maps.values().stream();

        //键值对流
        maps.entrySet().stream();

        //数组获取流
        String names[] = {"张三", "李四", "王五"};
        Stream<String> namesStream1 = Arrays.stream(names);
        Stream<String> naemsStream2 = Stream.of(names);
    }
}
