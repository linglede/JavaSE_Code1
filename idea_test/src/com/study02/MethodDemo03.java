package com.study02;

public class MethodDemo03 {
    public static void main(String[] args) {
        int result = sum(10,2);
        System.out.println(result);

        double result2 = sum(12.3,2.3);
        System.out.println(result2);

        int result3 = sum(2,3,5);
        System.out.println(result3);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
