package com.study02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("aaa", "111");
        map.put("bbb", "222");
        map.put("ccc", "333");

        //获取所有键的集合
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个值
        for (String key:keySet){
            //根据键去找值
            String value = map.get(key);
            System.out.println(key+","+value);
        }



    }
}
