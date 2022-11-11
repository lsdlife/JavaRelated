package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})   //元注解
@Retention(RetentionPolicy.RUNTIME)     //一直活着，在运行阶段这个注解也不消失
public @interface MyTest {
}
