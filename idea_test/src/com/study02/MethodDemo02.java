package com.study02;

/**
 * @author 17910
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        //实参
       /* isEvenNumber(6);
        getMax();
        getMax1(3,6);*/
       //isEvenNumber(10);
       boolean flag=isEvenNumber(10);
        System.out.println(flag);

        int result = getMax(3,6);
        System.out.println(result);
    }
    //定义一个方法，用于打印两个数字的较大数
    /*public static void getMax(){
    //方法中两个变量，用于保存两个数字
        int a = 10;
        int b = 20;
    //使用分支语句分两种情况对数字大小关系进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }*/
//int number 形参
    /*public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
*/
    //定义一个方法，用于打印两个数字的较大数
   /* public static void getMax1(int a,int b){
        //方法中两个变量，用于保存两个数字
        //使用分支语句分两种情况对数字大小关系进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }*/

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }

    }

    public static int getMax(int a,int b){
        //方法中两个变量，用于保存两个数字
        //使用分支语句分两种情况对数字大小关系进行处理
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
