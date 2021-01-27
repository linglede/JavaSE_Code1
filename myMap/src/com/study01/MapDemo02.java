package com.study01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");

       // System.out.println(map.remove("aaa"));
       // System.out.println(map.remove("www"));null

//        System.out.println(map.containsKey("aaa"));
//        System.out.println(map.containsValue("333"));

       // map.clear();
        //System.out.println(map.isEmpty());

        System.out.println(map.size());

        System.out.println(map);
    }
}
