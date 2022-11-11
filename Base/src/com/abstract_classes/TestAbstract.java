package com.abstract_classes;

public class TestAbstract {
    public static void main(String[] args) {
        //类比于写作文
        AbstractDemo cat=new AbstractCat();
        cat.run();
        cat.eat();
        AbstractDemo cattle =new AbstractCattle();
        cattle.eat();

    }
}
