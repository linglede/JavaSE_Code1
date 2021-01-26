package com.study09;

import java.util.LinkedList;

/**
 * @author 17910
 */

/*public void addFirst(E e)	在该列表开头插入指定的元素
public void addLast(E e)	将指定的元素追加到此列表的末尾
public E getFirst()	返回此列表中的第一个元素
public E getLast()	返回此列表中的最后一个元素
public E removeFirst()	从此列表中删除并返回第一个元素
public E removeLast()	从此列表中删除并返回第一个元素
*/

public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<>();

        //添加对象
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        linkedList.addFirst("jiang");
        linkedList.addLast("dong");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);
    }
}
