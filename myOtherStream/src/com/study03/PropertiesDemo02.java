package com.study03;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key,String value):设置集合的键和值，都是String类型，底层调用Hashtable方法put
        prop.setProperty("001","aaa");
        prop.setProperty("002","bbb");
        prop.setProperty("003","ccc");

        //System.out.println(prop.getProperty("001"));
        //System.out.println(prop.getProperty("0011"));
        //结果为null

        //System.out.println(prop);

        //Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键集对应的值是字符串

        Set<String> names = prop.stringPropertyNames();
        for (String key:names){
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}
