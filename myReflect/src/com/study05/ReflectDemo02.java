package com.study05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.study02.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method method1 = c.getMethod("method1");
        method1.invoke(obj);

        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(obj,"林青霞");

        Method method3 = c.getMethod("method3", String.class, int.class);
        Object o = method3.invoke(obj,"林青霞", 30);
        System.out.println(o);

        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(obj);
    }

}
