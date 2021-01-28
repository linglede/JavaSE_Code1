package com.study05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //创建HashMap集合，键是Character,值时Integer,无顺序排列
        //HashMap<Character,Integer> hm = new HashMap<>();
        //顺序排列
        TreeMap<Character,Integer> hm = new TreeMap<>();

        //遍历字符串，得到每一个字符
        for (int i=0;i<line.length();i++){
            char key = line.charAt(i);

            //得到的每一个字符作为键到HashMap集合中去找对应值，看起返回值
            Integer value = hm.get(key);

            if (value == null){
                //如果返回null,说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap集合，得到键和值，按照要求来拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
            }
        String result = sb.toString();
        System.out.println(result);

    }
}
