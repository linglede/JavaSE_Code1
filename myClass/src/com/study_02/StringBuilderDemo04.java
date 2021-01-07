package com.study_02;

/**
 * @author 17910
 */
public class StringBuilderDemo04 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素初始化
        int[] arr = {1,2,3,4,5,6,7};
        String s = arrayString(arr);
        System.out.println(s);
    }

    public static String arrayString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        String s = sb.toString();
        return s;
    }
}
