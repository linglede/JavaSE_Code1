package com.study05;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(80);
        ts.add(20);
        ts.add(110);
        ts.add(1);

        ts.add(80);

        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
