package com.abstract_classes;

public class AbstractCat extends AbstractDemo{
    //子类继承抽象类，实现父类的抽象方法
    @Override
    void eat() {
        System.out.println(" i am cat, i eat fish");
    }
}
