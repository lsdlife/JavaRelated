package com.object;

/**
 * StringBuilder的一些方法
 */

public class ToStringDemo {
    public static void main(String[] args) {
        /** Person p=new Person("皮皮虾",20);
         System.out.println(p.toString());
         */
        StringBuilder sb = new StringBuilder();
        sb.append("ab");
        sb.length();
        System.out.println(sb + "," + sb.length());
        sb.reverse();
        System.out.println(sb);
        System.out.println("\n");
        System.out.println(sb.toString());
    }
}
