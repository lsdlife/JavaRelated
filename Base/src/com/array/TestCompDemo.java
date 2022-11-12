package com.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 自定义数组排序规则
 */
public class TestCompDemo {
    public static void main(String[] args) {
        Integer[] arr = {20, 10, 2, 100, 34};
        //1.默认排序规则
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //2.自定义排序规则
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }
        });

        System.out.println(Arrays.toString(arr));

        int arr1[][] = new int[2][3];
        int m = arr1.length;   //行数
        int n = arr1[0].length;    //列数
        System.out.println(m);
        System.out.println(n);
    }
}
