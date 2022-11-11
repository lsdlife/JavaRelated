package com.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合有参构造器，可以设置Comparator接口对应的比较器对象，来定制比较规则。
 */
public class AppleCompare {
    public static void main(String[] args) {

        //方式二，用自带的比较器进行自定义
        /**
         * com.Set<Apple> sa=new TreeSet<>(new Comparator<Apple>() {
         *             @Override
         *             public int compare(Apple o1, Apple o2) {
         *                 return o2.getPrice()-o1.getPrice();    //按价格降序，方式一和方式二都有会默认用这个
         *             }
         *         });
         */
        //TreeSet
        Set<Apple> sa=new TreeSet<>(( o1,  o2) -> o2.getPrice()-o1.getPrice());

        sa.add(new Apple("红富士",25));
        sa.add(new Apple("黄将军",20));
        sa.add(new Apple("普通苹果",8));
        sa.add(new Apple("烂苹果",8));

       // System.out.println(sa);     //如果不自定义排序规则会报错

        //自定义排序规则后才能正常输出
        System.out.println(sa);





    }
}
