package com.exception;

/**
 * 自定义异常
 */

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            checkAge(-34);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 200) {
            throw new AgeIllegalException(age + " is illegal");
        } else {
            System.out.println("年龄合法");
        }
    }
}
