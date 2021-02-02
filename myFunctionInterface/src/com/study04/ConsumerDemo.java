package com.study04;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("林青霞",s-> System.out.println(s));

        operatorString("林青霞",System.out::println);

        operatorString("林青霞",s-> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }

    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
