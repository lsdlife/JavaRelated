package com.string;

public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("lsd");
        com.string.Door d = new com.string.Door();
        d.setName("wood door ");
        d.OpenDoor(p);
    }
}
