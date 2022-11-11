package com.recursion;

/**
 * ����1��n�Ľ׳�
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(PeachCount(1));
    }

    /**
     * public static int workout(int n) {
     * return n==1?n:n*workout(n-1);
     * }
     */


    //�ݹ���1��n�ĺ�
    /**
    public static int workout(int n) {
        return n == 1 ? n : n + workout(n - 1);
    }
     */


    /**
     *
     * ���ӵ�һ��ժ���������ӣ���������һ�룬���úò���񫣬�����ֶ����һ��
     * �ڶ����ֳ���ǰ��ʣ������������һ�룬���úò���񫣬�����ֶ����һ��
     * �Ժ�ÿ�춼�ǳ�ǰ��ʣ������������һ�룬���úò���񫣬�ֶ����һ��
     * �ȵ���10���ʱ��������ֻ��1���ˡ�
     * �������ʺ��ӵ�һ��ժ�˶��ٸ����ӣ�
     *
     */

    public static int PeachCount(int n) {
       //����ѧ��ʽ
       return n==10?1:2*PeachCount(n+1)+2;

    }

}

