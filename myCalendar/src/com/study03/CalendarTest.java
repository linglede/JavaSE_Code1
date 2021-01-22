package com.study03;

/*需求：获取任意一年的2月份天数*/

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //键盘录入任意年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();

        //设置月份，因为月份从0开始，所以设置值为2

        c.set(year,2,1);
        //3月份往前一天，就是2月份的最后一天
        c.add(Calendar.DATE,-1);
        //获取这一天
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年的2月份有"+date+"天");

    }
}
