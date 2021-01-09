package com.study_03;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        //在集合中添加字符串对象
        array.add("立即被");
        array.add("发热个人");
        array.add("发发第三个国");

        //遍历集合，首先要能够获取到集合中的每一个元素
        for(int i=0;i<array.size();i++) {
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
