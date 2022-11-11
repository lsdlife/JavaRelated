package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})  //类和方法
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String value();     //特殊属性

    double price() default 100;

    String[] author();

}
