package com.recursion;

public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(PeachCount(1));
    }
      public static int PeachCount(int n) {
        return n == 10 ? 1 : 2 * PeachCount(n + 1) + 2;
    }
}

