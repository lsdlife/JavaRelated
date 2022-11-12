package com.abstract_classes;

/**
 * 子类继承抽象类，实现父类的抽象方法
 */
public class AbstractCattle extends AbstractDemo {
    @Override
    void eat() {
        System.out.println("i am cattle, i eat galss");
    }
}
