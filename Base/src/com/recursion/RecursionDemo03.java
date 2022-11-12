package com.recursion;

public class RecursionDemo03 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;

    public static void main(String[] args) {
        BuyBeer(10);
        System.out.println("lastCoverNumber:" + lastCoverNumber);
        System.out.println("lastBottleNumber:" + lastBottleNumber);
    }

    public static void BuyBeer(int money) {
        int buynumber = money / 2;   //5
        totalNumber += buynumber;
        int coverNumber = lastCoverNumber + buynumber;
        int bottleNumber = lastBottleNumber + buynumber;

        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber += coverNumber % 4;
        if (bottleNumber >= 4) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber += bottleNumber % 2;
        if (allMoney >= 2) {
            BuyBeer(allMoney);
        }
    }
}
