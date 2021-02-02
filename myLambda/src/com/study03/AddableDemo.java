package com.study03;

public class AddableDemo {
    public static void main(String[] args) {
//        Add((int x ,int y)->{
//            return x+y;
//        });

        //参数类型可以省略，不能省略一个
        Add((x ,y)->{
            return x+y;
        });

        //如果参数只有一个，那么小括号可以省略
        //如果代码块的语句只有一条，可以省略大括号和分号，如果有return，return也可以省略
        Add((x ,y)->x+y);
    }

    private static void Add(Addable1 a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
