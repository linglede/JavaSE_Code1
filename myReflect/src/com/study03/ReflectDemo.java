package com.study03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.study02.Student");

        //Constructor<?>[] getConstructors() 返回一个包含Constructor对象的数组，Constructor对象反映了由该Class对象表示的类的所有公共构造函数
       // Constructor<?>[] cons = c.getConstructors();

        //Constructor<?>[] getDeclaredConstructors():返回反映由该Class对象表示的类声明的所有构造函数的Constructor对象
        Constructor<?>[] cons = c.getDeclaredConstructors();

        for (Constructor con:cons){
            System.out.println(con);
        }
        System.out.println("------------");

        //Constructor<?>[] getConstructor(Class<?>...parameterTypes) 返回一个Constructor对象,该对象反映由该Class对象表示的类的指定公共构造函数
        //Constructor<?>[] getDeclaredConstructor(Class<?>...parameterTypes):返回一个Constructor对象，该对象反映由此Class对象表示的类或接口的指定的构造函数
        //参数：你要获取的构造方法的参数个数和数据类型对应的字节码文件对象

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
