package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,
 * 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
 */

public class MapExp {
    public static void main(String[] args) {
        String str[] = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        //产生学生的选择结果
        for (int i = 0; i < 80; i++) {
            sb.append(str[r.nextInt(str.length)]);      //拼接成一个字符串
        }
        //  System.out.println(sb);

        //定义一个集合接受投票结果
        Map<Character, Integer> infos = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < sb.length(); i++) {
            //提取当前选择景点字符
            char ch = sb.charAt(i);
            //判断
            if (infos.containsKey(ch)) {
                infos.put(ch, infos.get(ch) + 1);
            } else {
                infos.put(ch, 1);
            }
        }

        //遍历键值对获取Value
        //infos.forEach(( key,  value)-> System.out.println(key+"==="+value));
        System.out.println(infos);
    }
}
