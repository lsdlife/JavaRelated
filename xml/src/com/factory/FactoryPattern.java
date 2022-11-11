package com.factory;

public class FactoryPattern {
    /**
     * 定义一个方法，创建对象放回
     */
    public static Computer creatComputer(String info) {
        switch (info) {
            case "Lenovo":
                Computer c = new Lenovo();
                c.setName("Lenovo");
                c.setPrice(4799);
                return c;
            case "Mac":
                Computer c1 = new Lenovo();
                c1.setName("Mac");
                c1.setPrice(9999);
                return c1;
            default:
                return null;


        }
    }
}
