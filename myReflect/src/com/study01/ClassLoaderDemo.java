package com.study01;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        //返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);
        //AppClassLoade

        //返回父类加载器进行委派
        ClassLoader c2 = c.getParent();
        System.out.println(c2);
        //ExtClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);
        //null


    }
}
