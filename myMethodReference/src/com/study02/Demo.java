package com.study02;


public class Demo {
    public static void main(String[] args) {
        usePrintable(s-> System.out.println(s));

        //方法引用符  ::
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p ){
        p.printInt(666);
    }
}
