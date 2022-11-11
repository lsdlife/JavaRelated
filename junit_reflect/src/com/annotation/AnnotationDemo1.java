package com.annotation;

/**
 * 目标；学会自定义注解，掌握其定义格式和语法
 */

@Mybook(name = "精通Java SE", authors = {"黑马", "lsd"}, price = 199.5)
//@Book1(value="/delete")
//@Book1(value= "/delete",price =29.2)
@Book1("/delete")


public class AnnotationDemo1 {
    @Mybook(name = "精通Java SE", authors = {"黑马", "lsd"}, price = 199.5)
    private AnnotationDemo1() {
    }

    @Mybook(name = "精通Java SE", authors = {"黑马", "lsd"}, price = 199.5)
    public static void main(String[] args) {

        @Mybook(name = "精通Java SE", authors = {"黑马", "lsd"}, price = 199.5)
        int age = 21;
    }

}
