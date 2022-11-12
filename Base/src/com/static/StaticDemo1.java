/**
 *
 */
public class StaticDemo1 {
    String name;    //属于对象。
    private static int age = 20;     //属于类，所有对象共享
    public static void main(String[] args) {
        StaticDemo1 sd = new StaticDemo1();
        sd.name = "lsd";
        StaticDemo1.age = 21;
        System.out.println(age);        //21
    }
}
