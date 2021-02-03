package com.study05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {

        Properties p = new Properties();
        FileReader fr = new FileReader("D:\\JavaSE_Code\\myReflect\\class.txt");
        p.load(fr);
        fr.close();

        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);


    }

}
