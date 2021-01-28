package com.study03;

/*
* 需求：创建HashMap集合，键是学号，值是学生对象。存储三个键值对元素，并遍历
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String,Student> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("aaa",11);
        Student s2 = new Student("bbb",14);
        Student s3 = new Student("ccc",22);

        //添加学生对象
        hm.put("001",s1);
        hm.put("002",s2);
        hm.put("003",s3);

        //方式一：键找值
        Set<String> set =hm.keySet();
        for(String key:hm.keySet()){
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        //方法2：键值对对象找键和值
        Set<Map.Entry<String,Student>> entrySet = hm.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String,Student> me :entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

    }
}
