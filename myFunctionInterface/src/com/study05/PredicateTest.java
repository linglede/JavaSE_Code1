package com.study05;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        String[] strArray = {"林青霞,35","ccc,22","bbb,14","aaa,23"};

        ArrayList<String> list = myFilter(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String str:list){
            System.out.println(str);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> array = new ArrayList<>();

        for (String str:strArray){
            if(pre1.and(pre2).test(str)){
                array.add(str);
            }
        }
        return array;
    }
}
