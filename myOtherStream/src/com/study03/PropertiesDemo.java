package com.study03;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //存储元素
        prop.put("001","aaa");
        prop.put("002","bbb");
        prop.put("003","ccc");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key :keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
