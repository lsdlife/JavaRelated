package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List删除存在的问题
 */

public class LinkedList04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("赵敏");
        list.add("素素");

        //需求；删除全部的Java信息
        //a.迭代器遍历删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String e = it.next();
            if ("java".equals(e)) {
                //不要用集合去删除
                //list.remove(e);
                it.remove();    //使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
            }
        }
        System.out.println(list);

        //lambda表达式 会出现bug
        //for循环 会漏掉元素

        //解决方案1
        for (int i = list.size() - 1; i >= 0; i--) {
            String e = list.get(i);
            if ("java".equals(e)) {
                list.remove("java");
            }
        }
        System.out.println(list);

        //解决方案2(不建议)
        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            if ("java".equals(e)) {
                list.remove("java");
                i--;
            }
        }
        System.out.println(list);
    }
}
