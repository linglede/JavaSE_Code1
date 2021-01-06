package com.study03;

/**
 * @author 17910
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {22,11,55,66,44};
        int[] arr2 = {22,11,55,66,44};

        boolean flag = compare(arr,arr2);
        System.out.println(flag);
    }

    public static boolean compare(int[] arr,int[] arr2){
        if(arr.length != arr2.length){
            return false;
        }

        for(int x=0;x<arr.length;x++){
            if(arr[x] != arr2[x]){
                return false;
            }
        }
        return true;
    }
}
