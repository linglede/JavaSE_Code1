package com.study01;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream out = System.out;

        out.print(23);
        System.out.print(23);
    }
}
