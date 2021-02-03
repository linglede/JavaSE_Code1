package com.study04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.study02.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Field nameFiled = c.getField("name");
        Field nameFiled = c.getDeclaredField("name");
        nameFiled.setAccessible(true);
        nameFiled.set(obj,"林青霞");
        System.out.println(obj);

        Field ageFiled = c.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(obj,22);
        System.out.println(obj);

        Field addressFiled = c.getDeclaredField("address");
        addressFiled.setAccessible(true);
        addressFiled.set(obj,"西安");

        System.out.println(obj);
    }
}
