package com.study01;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();
        //public long getTime()	获取的是日期对象从1970年1月1日00：00：00到现在的毫秒值
        System.out.println(d.getTime());

        //public void setTime(long time)	设置时间，给的是毫秒值
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
