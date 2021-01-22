package com.study02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s1);

        String s2 = "2021-01-19 10:13:15";
        Date toDate = DateUtils.stringToDate(s2, "yyyy-MM-dd HH:mm:ss");
        System.out.println(toDate);
    }
}
