package com.study_03;


import java.util.ArrayList;

/*
* 方法名	说明
public Boolean remove(Object o)	删除指定的元素，返回删除是否成功
public E remove(int index)	删除指定索引处的元素，返回被删除的元素
public E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
public E get(int index)	返回指定索引处元素
public int size()	返回集合中元素的个数
*/
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("nihao");
        array.add("hello");
        array.add("java");

        System.out.println("array:"+array);

        /*//删除指定的元素
        array.remove("nihao");
        System.out.println("array:"+array);

        //删除指定索引处的元素
        array.remove(1);
        System.out.println("array:"+array);

        //修改指定索引处的元素
        array.set(0,"good");
        System.out.println("array:"+array);

        //返回指定索引处元素
        array.get(2);
        System.out.println(array.get(2));*/

        //返回集合中元素的个数
        System.out.println(array.size());

    }
}
