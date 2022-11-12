package com.files.buffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对汉字的数字进行排序
 */

public class exp {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        Collections.addAll(data, "一", "七", "三", "二", "五", "八", "六", "四");
        Collections.sort(data);
        System.out.println(data);   //不能排序

        List<String> data1 = new ArrayList<>();
        Collections.addAll(data1, "一", "二", "三", "四", "五", "六", "七", "八");

        /**
         * 自定义排序规则
         */

//        Collections.sort(data, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //索引位置就是它的大小
//                //data1.indeOf("二)=1
//                return (data1.indexOf(o1.substring(0))-data1.indexOf(o2.substring(0)));
//            }
//        });

        Collections.sort(data,
                (o1, o2) -> data1.indexOf(o1.substring(0)) - data1.indexOf(o2.substring(0)));
        System.out.println(data1);
    }
}
