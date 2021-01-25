package com.study01;


/*
* 方法名	说明
boolean add(E e)	添加元素
boolean remove(Object o)	从集合中移除指定元素
void clear()	清空集合中的元素
boolean contains(Object o)	判断集合中是否存在指定元素
boolean isEmpty()	判断集合是否为空
int size()	集合的长度，也就是集合中元素的个数

*/

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 17910
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c =new ArrayList<>();

        //add
        /*System.out.println(c.add("hello"));
        System.out.println(c.add("world"));*/

        c.add("hello");
        c.add("world");

        //remove
        //System.out.println(c.remove("world"));
        //System.out.println(c.remove("javasee"));

        //clear()
        //c.clear();

        //contains()
        //System.out.println(c.contains("hello"));

        //isEmpty()
        //System.out.println(c.isEmpty());

        //size()
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
    }
}
