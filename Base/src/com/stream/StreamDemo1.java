package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "赵敏", "周芷若", "张强");
        System.out.println(names);
/*
        System.out.println("--------------");
        //从集合中找出姓张的放在集合中
        List<String> zhang=new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("张")){
                zhang.add(name);
            }
        }
        System.out.println(zhang);
        //长度为3的
        List<String> zhang3=new ArrayList<>();
        for (String name : zhang) {
            if(name.length()==3){
                zhang3.add(name);
            }
        }
        System.out.println(zhang3);
*/
        //使用stream流
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
