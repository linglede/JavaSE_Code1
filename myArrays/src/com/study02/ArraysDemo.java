package com.study02;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10,52,11,61};

        System.out.println("排序前："+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
