package com.study03;

import java.util.Scanner;

/**
 * @author 17910
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个评委打分：");
            arr[i] = sc.nextInt();
        }

        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("最终得分"+avg);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int x=0;x<arr.length;x++){
            sum += arr[x];
        }
        return sum;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x=0;x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int x=0;x<arr.length;x++){
            if(arr[x]<min){
                min = arr[x];
            }
        }
        return min;
    }
}
