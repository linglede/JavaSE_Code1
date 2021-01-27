package com.study01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");

        //System.out.println(map.get("aaa"));
        //System.out.println(map.get("sss"));null

        //获取所有键的集合
        Set<String> keySet = map.keySet();
        for(String s:keySet){
            System.out.println(s);
        }

        //获取所有值的集合
        Collection<String> values = map.values();
        for(String s:values){
            System.out.println(s);
        }

        System.out.println(map);
    }
}
