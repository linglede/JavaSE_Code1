package com.study04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 17910
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String>> array = new ArrayList<>();

        //创建HashMap集合，并添加键值对
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("aaa","111");
        hm1.put("bbb","222");
        //把hashMap作为元素添加到ArrayList集合
        array.add(hm1);

        HashMap<String,String> hm2 = new HashMap<>();
        hm2.put("ccc","333");
        hm2.put("ddd","444");
        //把hashMap作为元素添加到ArrayList集合
        array.add(hm2);

        HashMap<String,String> hm3 = new HashMap<>();
        hm1.put("eee","555");
        hm1.put("fff","666");
        //把hashMap作为元素添加到ArrayList集合
        array.add(hm3);

        //遍历ArrayList集合
        for (HashMap<String,String> hm :array){
            Set<String> keySet = hm.keySet();
            for (String key:keySet){
                String value = hm.get(key);
                System.out.println(key+","+value);
            }
        }
    }
}
