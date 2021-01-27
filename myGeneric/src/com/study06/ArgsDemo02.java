package com.study06;

/*Arrays工具类中有一个静态方法:
	public static<T> List<T> asList(T... a):返回由指定数组支持的固定大小的列表
List接口中有一个静态方法:
	public static<E> List<E> of(E... elements ):返回包含任意数量元素的不可变列表
Set 接口中有个静态方法:
	publc static <E>Set of(... elements):返回一个包含任意数量元案的不可变集合
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello","world","java");
//
//       // list.add("fef");UnsupportedOperationException
//        //list.remove("world");UnsupportedOperationException
//        list.set(1,"fef");
//
//        System.out.println(list);



        //java9 才能实现
        //List<String> list = List.of("hello","world","java");
       // list.add("dsf");异常
        //list.remove("hello");异常
        //list.set(1,"javaee");异常
        //System.out.println(list);

        //Set<String> set = Set.of("hello","world","java","world");异常，set集合中不能又重复元素
        //set.add("dsdf");异常
        //set.remove("hello");异常
        //没有修改的方法
    }
}
