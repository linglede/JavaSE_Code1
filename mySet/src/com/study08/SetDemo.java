package com.study08;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*需求：编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出*/

public class SetDemo {
    public static void main(String[] args) {
        //创建Set集合,用HashSet不会排序,TreeSet会排序
        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();

        //创建随机数对象
        Random r = new Random();

        //判断集合的长度是否小于10
        while (set.size()<10){
            //产生一个随机数，添加到集合
            int num = r.nextInt(20)+1;
            set.add(num);

        }

        //遍历集合
        for (Integer i :set){
            System.out.println(i);
        }
    }
}
