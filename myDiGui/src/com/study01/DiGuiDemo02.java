package com.study01;

//用递归求阶乘

public class DiGuiDemo02 {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println("5的阶层是："+jc);
    }

    public static int jc(int n){
        if (n==1){
            return 1;
        }else {
            return n*jc(n-1);
        }
    }
}
