package com.recursion;

/**
 * ơ��2Ԫ1ƿ��4�����ӿ��Ի�һƿ��2����ƿ���Ի�һƿ��
 * ����10ԪǮ���Ժȶ���ƿ�ƣ�ʣ����ٿ�ƿ�͸��ӡ�
 */
public class RecursionDemo03 {
    //���徲̬�ĳ�Ա�����洢������ľ���������Ҫ�ۼ�
    public static   int totalNumber;
    public static int lastBottleNumber;  //ÿ��ʣ���ƿ����
    public static  int lastCoverNumber; //��¼ÿ��ʣ��ĸ�����

    public static void main(String[] args) {
        BuyBeer(10);
        System.out.println("ʣ���������" + lastCoverNumber);
        System.out.println("ʣ��ƿ������" + lastBottleNumber);

    }

    public static void BuyBeer(int money){
        int buynumber=money/2;   //5
        totalNumber+=buynumber;
        //���Ӻ�ƿ�ӻ����Ǯ
        //ͳ�Ƹ�����+ƿ����
        int coverNumber=lastCoverNumber+buynumber;
        int bottleNumber=lastBottleNumber+buynumber;

        //ͳ�ƿ��Ի���Ľ��
        int allMoney=0;
        if(coverNumber>=4){
            allMoney+=(coverNumber/4)*2;

        }
        lastCoverNumber+=coverNumber%4;

        if(bottleNumber>=4){
            allMoney+=(bottleNumber/2)*2;

        }
        lastBottleNumber+=bottleNumber%2;

        if(allMoney>=2){
            BuyBeer(allMoney);
        }

    }
}
