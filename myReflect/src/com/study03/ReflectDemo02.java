package com.study03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.study02.Student");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);

        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);

    }
}
