package com.regex;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.regex.Pattern;

public class MatchesDemo {
    public MatchesDemo() {
    }

    public static void main(String[] args) {
        String str = "299088";
        boolean a = str.matches("\\d{6,10}");
        System.out.println(a);
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "fsdsa"));
    }
}
