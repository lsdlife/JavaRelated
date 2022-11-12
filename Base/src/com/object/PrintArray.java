package com.object;

/**
 * 数组转为字符数组并打印
 */

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = {10, 2, 30, 40};
        PrintArray p = new PrintArray();
        System.out.println(p.ArrayToString(arr));
    }

    public static String ArrayToString(int arr[]) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
