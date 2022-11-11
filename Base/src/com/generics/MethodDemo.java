package com.generics;

public class MethodDemo {
    public static void main(String[] args) {
        String names[]={"小路","蓉蓉","小河"};
        printArray(names);


        Integer ages[]={10,20,30};
        printArray(ages);
    }

    //另一个泛型方法
    public static <T> T[] getArr(T[] arr){
        return arr;
    }


    //泛型方法
    public static <T> void printArray(T[] arr){
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length-1?"":",");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }
    }
}



