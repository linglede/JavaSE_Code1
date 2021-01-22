package com.study02;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();

        //需求1：3年前的今天
        //c.add(Calendar.YEAR,-3);
        //需求2：10年后的5天前
        /*c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);*/

        //设置时间

        c.set(2020,5,20);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date);
    }
}
