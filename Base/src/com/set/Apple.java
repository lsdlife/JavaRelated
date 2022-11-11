package com.set;


//方式一，实现Comparable接口

public class Apple implements Comparable<Apple> {

    public Apple() {
    }

    public Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private  int price;

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    /**
     * 方式一：让自定义的类实现Comparable接口重写里面的compareTo方法来定制比较规则。
     *
     * 重写比较方法
     * @param
     * @return
     */
    @Override
    public int compareTo(Apple o) {

        //如果认为第一个大于第一个，返回正整数即是升序

          return this.price-o.price;        //按价格升序

        //不要去重，定义相等时哪个大
        //return this.price-o.price >=0?1:-1;
    }
}
