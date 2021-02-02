package com.study01;

import com.study01.Printable;

public class Demo {
    public static void main(String[] args) {
        usePrintable(s-> System.out.println(s));

        //方法引用符  ::
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p ){
        p.printString("ajinivni");
    }
}
