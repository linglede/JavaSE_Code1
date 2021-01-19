package com.study03;

/*
*   有一个字符串：“91 27 46 38 50”，实现最终结果为“27 38 46 50 91”
* */

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        //把字符串中的数据存储到int类型的数组中
        String[] strArray = s.split(" ");

        //定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        int[] arr = new int[strArray.length];
        for (int i=0;i<strArray.length;i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }

        //排序
        Arrays.sort(arr);
        /*for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        // 拼接

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }

        String result = sb.toString();

        System.out.println(result);
    }
}
