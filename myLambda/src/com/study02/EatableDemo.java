package com.study02;

public class EatableDemo {
    public static void main(String[] args) {
//        Eatable e = new EatableImpl();
//        useEatable(e);

        //匿名内部类方法
//        useEatable(new Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("fefesfw");
//            }
//        });

        useEatable(()->{
            System.out.println("frjogjr");
        });
    }

    private static void useEatable(Eatable e){
        e.eat();
    }
}
