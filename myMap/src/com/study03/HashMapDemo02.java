package com.study03;

import java.util.HashMap;
import java.util.Set;


/*
*  存在相同的键，值应当会被覆盖，因此需要在Student类中重写hashcode()和equals()方法
* */

public class HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("aaa",11);
        Student s2 = new Student("bbb",14);
        Student s3 = new Student("ccc",22);

        Student s4 = new Student("ccc",22);

        //添加学生对象
        hm.put(s1,"jiangxi");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"北京");

        //遍历集合
        Set<Student> keySet = hm.keySet();
        for (Student key:keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
