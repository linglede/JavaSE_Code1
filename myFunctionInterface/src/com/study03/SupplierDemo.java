package com.study03;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(()->"林青霞");
        System.out.println(s);
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
