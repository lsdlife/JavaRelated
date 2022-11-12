public class StaticDemo2 {
    //如果是对象自己的行为，则可以申明为实例方法
    public void run() {
        System.out.println("runing fast");
    }
    //如果是执行成一个共用的功能，则可以声明为静态方法。
    public static void eat() {
        System.out.println("eat sth");
    }
    public static void main(String[] args) {
    }
}
