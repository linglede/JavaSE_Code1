package com.study01;

/*
每月的兔子对数：1，1，2，3，5，8.。。
* 求第20个月兔子的对数
* */

public class DiGuiDemo {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1] +arr[i-2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));

    }

    public static int f(int n){
        //递归出口
        if (n==1||n==2){
            return 1;
        }else{
        return f(n-1)+f(n-2);
        }
    }

}
