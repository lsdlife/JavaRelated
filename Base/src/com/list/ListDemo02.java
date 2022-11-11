package com.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List的四种遍历方式
 */

public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<>();
        lists.add("java");
        lists.add("is ");
        lists.add("Rubbish ");


        //1.for循环
        System.out.println("------------");
        for (int i = 0; i < lists.size(); i++) {
            String e=lists.get(i);
            System.out.println(e);
        }


        //2.迭代器
        System.out.println("-----------");
        Iterator <String> it=lists.iterator();
        while(it.hasNext()){
            String e=it.next();
            System.out.println(e);
        }

        //3.foreach
        System.out.println("----------");
        for (String e : lists) {
            System.out.println(e);
        }


        //4.JDK1.8之后的遍历方式
        /**
        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);;
            }
        });
         */
        lists.forEach( s -> System.out.println(s));
    }

}
