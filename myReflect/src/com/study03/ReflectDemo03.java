package com.study03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.study02.Student");

        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射
        //public void setAccessible(boolean flag):值为true，取消访问设置
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
