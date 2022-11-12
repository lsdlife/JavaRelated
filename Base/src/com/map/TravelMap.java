package com.map;

import java.util.*;

/**
 * 某个班级多名学生，现在需要组成秋游活动，班长提供了四个景点（A,B,C,D)
 * 每个学生可以选择多个景点，请统计出最终哪个景点想去的人数最多
 * <p>
 * 注意：每个人有多个选择: {张三=A，B,C},{李四=A,C}
 */

public class TravelMap {
    public static void main(String[] args) {
        //1.学生选择的数据List集合
        Map<String, List<String>> data = new HashMap<>();
        List<String> selects = new ArrayList<>();

        //某一个学生的操作
        Collections.addAll(selects, "A", "B", "C");
        data.put("张三", selects);
        List<String> select1 = new ArrayList<>();

        //某一个学生的操作
        Collections.addAll(select1, "B", "C");
        data.put("李四", select1);
        List<String> select2 = new ArrayList<>();

        //某一个学生的操作
        Collections.addAll(select2, "B", "C");
        data.put("王五", select2);

        //2.遍历学生的选择结果这个List集合获取数量
        Collection<List<String>> values = data.values();
        //3.使用Map集合来统计List集合中A，B，C的个数
        Map<String, Integer> infos = new HashMap<>();
        for (List<String> value : values) {
            //{A,B,C}
            for (String s : value) {
                //用Map键值对来存储
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }
            }
        }
        //输出
        System.out.println(infos);
    }
}
