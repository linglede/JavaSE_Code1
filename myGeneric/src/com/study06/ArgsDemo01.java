package com.study06;

public class ArgsDemo01 {
    public static void main(String[] args) {

        System.out.println(sum(11, 22, 4, 5, 6, 7));
    }

    //可变参数
    public static int sum(int... a){
        int sum = 0;

        for (int i:a){
            sum += i;
        }
        return sum;
    }
}
