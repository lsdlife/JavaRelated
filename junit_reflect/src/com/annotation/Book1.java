package com.annotation;

public @interface Book1 {
    String value();     //特殊属性

    double price() default 100;
}
