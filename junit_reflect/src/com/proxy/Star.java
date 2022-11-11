package com.proxy;

public class Star implements Skill {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("杨超越跳舞nice");
    }

    @Override
    public void sing() {
        System.out.println("杨超越唱歌很好听");
    }
}
