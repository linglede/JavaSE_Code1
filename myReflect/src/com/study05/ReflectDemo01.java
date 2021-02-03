package com.study05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.study02.Student");

        //Method[] getMethods（）返回一个包含方法对象的数组，方法对象反映由该Class对象表示的类或接口的所有公共方法，包含由类或接口声明的对象以及从超类和超级接口继承的类
        //Method[] methods = c.getMethods();

        //Method[] getDeclaredMethods（）返回一个包含方法对象的数组，方法对象反映由该Class对象表示的类或接口的所有方法
        Method[] methods = c.getDeclaredMethods();

        for (Method method:methods){
            System.out.println(method);
        }
        System.out.println("-------------");

        Method method1 = c.getMethod("method1");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        method1.invoke(obj);
    }
}
