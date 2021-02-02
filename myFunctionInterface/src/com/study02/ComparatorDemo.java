package com.study02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("a");
        array.add("bbb");

        System.out.println("排序前"+array);
        Collections.sort(array,getComparator());

        System.out.println("排序后"+array);
    }

    private static Comparator<String> getComparator(){
        //匿名内部类方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//        return comp;
//
//        return (String s1,String s2)->{
//            return s1.length()-s2.length();
//        };
//
        return (s1,s2)->s1.length()-s2.length();
    }
}
