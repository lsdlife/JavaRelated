package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("张三");
        lists.add("周芷若");
        lists.add("张三丰");
        lists.add("赵敏");
        lists.add("张真人");

        //Stream<T> filter
        /**
         *   lists.stream().filter(new Predicate<String>() {
         *             @Override
         *             public boolean test(String s) {
         *                 return s.startsWith("张");
         *             }
         *         });
         */

        //lists.stream().filter(s->s.startsWith("张") ).forEach(s-> System.out.println(s));

        //获取结果前两个
        //lists.stream().filter(s->s.startsWith("张")).limit(2).forEach(s-> System.out.println(s));
        //lists.stream().filter(s->s.startsWith("张")).limit(2).forEach(System.out::println);

        //lists.stream().filter(s->s.startsWith("张")).skip(2).forEach(System.out::println);

        //用map进行加工: 第一个参数是原材料，第二个参数是加工后的结果
        //给集合元素加上一个前缀：黑马的
        /**
         *    lists.stream().map(new Function<String, String>() {
         *             @Override
         *             public String apply(String s) {
         *                 return "黑马的"+s;
         *             }
         *         });
         */
        //lists.stream().map( s->  "黑马的"+s).forEach(System.out::println);
        //lists.stream().map( s->  "黑马的"+s).forEach(s-> System.out.println(s));

        System.out.println("---------");
        //需求：把所有名称加工成一个学生对象
        lists.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        //lists.stream().map(Student::new).forEach(System.out::println);    //构造器引用，方法引用

        System.out.println("-------");
        //合并流
        Stream<String> s1 = lists.stream().filter(s -> s.startsWith("张"));
        Stream<Integer> s2 = Stream.of(22, 23);
        Stream<Object> s3 = Stream.concat(s1, s2);

        //forEach是终结方法,之后不可以有语句，不然会报异常
        s3.forEach(System.out::println);
    }
}
