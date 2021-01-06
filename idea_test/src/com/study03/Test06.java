package com.study03;

/**
 * @author 17910
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {22,11,55,66,44};

        reverse(arr);
        printArray(arr);
    }

    public static void reverse(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }
}
