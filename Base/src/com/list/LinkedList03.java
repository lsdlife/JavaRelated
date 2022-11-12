package com.list;

import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        //栈
        LinkedList<String> stack = new LinkedList<>();
        //入栈
        stack.addFirst("子弹1");  //加入到表头,可以用push
        stack.addFirst("子弹2");
        stack.addFirst("子弹3");
        stack.addFirst("子弹4");
        System.out.println(stack);  //[子弹4, 子弹3, 子弹2, 子弹1]
        //出栈
        stack.removeFirst();
        System.out.println(stack);

        //队列
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("第1个人");      //尾插法
        queue.addLast("第2个人");
        queue.addLast("第3个人");
        queue.addLast("第4个人");
        System.out.println(queue);
        //出队
        queue.removeFirst();
        System.out.println(queue);
    }
}
