package com.study02;

public class ArrayTest01 {
    public static void main(String[] args) {
        int  [] arr = {12,15,44,1,56};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
