package com.study01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        //多态形式
        Calendar c =Calendar.getInstance();

        //System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date);
    }
}
