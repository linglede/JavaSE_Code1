package com.study04;

public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<>();
        g1.show("dfsfs");

        Generic<Integer> g2 = new GenericImpl<>();
        g2.show(43434);
    }
}
