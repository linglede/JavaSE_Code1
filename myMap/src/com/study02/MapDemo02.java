package com.study02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("aaa", "111");
        map.put("bbb", "222");
        map.put("ccc", "333");

        //获取所有键值对对象
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String,String> me :entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }

    }
}
