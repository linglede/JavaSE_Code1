package com.study01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);

        //将指定的列表按升序排序
        //Collections.sort(list);

        //反转
        //Collections.reverse(list);

        //使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);

        System.out.println(list);
    }
}
