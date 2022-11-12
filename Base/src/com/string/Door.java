package com.string;

public class Door {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name;
    public void OpenDoor(com.string.Person p) {
        System.out.println(p.getName() + " has been open " + this.getName());
    }
}
