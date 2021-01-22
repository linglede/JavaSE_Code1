package com.study01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("start");
        //method();
        try{method2();
        }catch (ParseException e){
            e.printStackTrace();
        }

        System.out.println("end");
    }

    //运行时异常

    public static void method()throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }


    //编译时异常

   /* public static void method2() {

        try{
            String s = "2021-01-22";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
*/
   public static void method2() throws ParseException {

       String s = "2021-01-22";
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date d = sdf.parse(s);
       System.out.println(d);
   }
}