package com.study04;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.study02.Student");

        //Field[] getFileds()返回一个包含Filed对象的数组，Filed对象反映由该对象表示的类或其他接口的说有可访问的公共字段
        //Field[] getDeclaredFields()返回一个Filed对象数组，反映由该Class对象表示的类或接口的声明的所有字段

        //Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("----------");

        Field addressField = c.getField("address");

        //获取无参构造方法获取对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        addressField.set(obj,"西安");
        //给obj的成员变量addressField赋值为西安

        System.out.println(obj);
    }
}
