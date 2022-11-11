package com.regex;

import java.util.regex.Pattern;

/**
 * 正则表达式的匹配
 */

public class MatchesDemo {
    public static void main(String[] args) {
        String str="299088";
        boolean a=str.matches("\\d{6,10}");
        System.out.println(a);
        

        System.out.println(Pattern.matches( "[a-zA-Z0-9]{6}" ,  "fsdsa" )); //真的

    }

}
