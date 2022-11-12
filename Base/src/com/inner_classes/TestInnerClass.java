package com.inner_classes;

public class TestInnerClass {
    // 内部类创建对象的格式
    public static void main(String[] args) {
        StaticInnerClass.Inner innerclass = new StaticInnerClass.Inner();
        innerclass.run();
        StaticInnerClass si = new StaticInnerClass();
        si.name = "aaa";
    }
}
