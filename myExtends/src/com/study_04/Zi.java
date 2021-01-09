package com.study_04;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi中method方法被调用" );
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Zi中show方法被调用");
    }
}
