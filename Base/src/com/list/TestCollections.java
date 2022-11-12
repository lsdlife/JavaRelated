package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "aaa", "ccc", "bbb");
        System.out.println(names);
        System.out.println("-------");
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println("------------");
        // 3.public static <T> void sort(List<T> list);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 23, 2, 34, 4);
        // Collections.sort(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }
}
