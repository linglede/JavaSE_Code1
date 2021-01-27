package com.study01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();

        //添加元素
        map.put("it001","aaa");
        map.put("it002","bbb");
        map.put("it003","ccc");
        map.put("it004","ddd");
       // map.put("it004","eee"); 将ddd替换掉

        System.out.println(map);
    }
}
