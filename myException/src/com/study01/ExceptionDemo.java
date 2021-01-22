package com.study01;


/**
 * @author 17910
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        method();
        System.out.println("结束");
    }

    public static void method(){


        //System.out.println(arr[1]);
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            //new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            //把异常的错误信息输出在控制台
             e.printStackTrace();

            //返回此throwable的详细信息字符串
           // System.out.println(e.getMessage());

            //返回此可抛出的简短描述
            //System.out.println(e.toString());
        }

        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3*/
    }
}
