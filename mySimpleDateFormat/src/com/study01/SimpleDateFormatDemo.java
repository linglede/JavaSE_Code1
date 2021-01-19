package com.study01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化（从Date到String） public final String format(Date date):将日期格式化成日期/时间字符串
        Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        String ss = "2021-01-18 20:10:30";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf1.parse(ss);
        System.out.println(dd);
    }
}