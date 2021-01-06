package com.study02;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();
    }
    public static void isEvenNumber(){
        int num = 10;
        if(num%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
