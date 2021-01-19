package com.study01;
/*
* 冒泡排序
* */


public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {14,55,21,12,41};
        System.out.println("排序前："+arrayToString(arr));

        for (int x=0;x<arr.length-1;x++){
            for (int i=0;i<arr.length-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }

        System.out.println("排序后："+arrayToString(arr));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
