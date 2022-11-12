/**
 * 单例模式：一个类永远只能创建一个对象。
 * 饿汉单例模式：用类获取对象的时候，对象已经提前创建好了。
 */

public  class SingleInstance {

    /**
     * 设计步骤：
     * 1.定义一个类，把构造器私有。
     * 2.定义一个静态变量存储一个对象。
     */

    //定义单例类
    public static SingleInstance instance = new SingleInstance();

    //定义一个静态变量存储对象
    private SingleInstance() {   //必须私有构造器
        System.out.println("创建了一个对象");
    }
}
