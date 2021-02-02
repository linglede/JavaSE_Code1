package com.study04;

public class Demo {
    public static void main(String[] args) {
//        usePrinter(s -> {
//            String result = s.toUpperCase();
//            System.out.println(result);
//        });
        usePrinter(s-> System.out.println(s.toUpperCase()));

        //引用对象的实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        //Lambda表达式被引用对象的实例方法替代的时候，他的形式参数全部传递给该方法作为参数
    }

    private static void usePrinter(Printer p){
        p.printUpperCase("helloworld");
    }
}
