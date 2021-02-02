package com.study05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        //需求1：得到名字为3个字的流
        Stream<String> listStream = womanList.stream().filter(s -> s.length() == 3);

        //2：把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for (String name:names){
            System.out.println(name);
        }


        //创建Set集合对象
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        //得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);

        //把使用Stream流操作完毕的数据收集到Set集合中并遍历
        List<Integer> ages = setStream.collect(Collectors.toList());

        for (Integer i:ages){
            System.out.println(i);
        }

        String[] strArray = {"林青霞,30","张曼玉,35","王祖贤,33","路演,25"};

        //得到大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        //把数据收集到Map集合中并遍历，姓名做键，年龄做值
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }




    }
}
