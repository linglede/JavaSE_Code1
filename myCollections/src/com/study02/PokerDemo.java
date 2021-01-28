package com.study02;

/*
*  需求：通过程序实现斗地主过程中的洗牌发牌和看牌
* */

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里装牌
        //定义花色数组
        String[] colors = {"♦","♣","♥","♠"};
        //定义点数数组
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String color:colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("大王");
        array.add("小王");

        //洗牌，用Collections的shuffle()方法实现
        Collections.shuffle(array);

        //发牌，遍历集合，给三个玩家发牌
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<>();
        ArrayList<String> fqyArray = new ArrayList<>();
        //底牌
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i = 0;i<array.size();i++){
            String poker = array.get(i);

            if (i>=array.size()-3){
                dpArray.add(poker);
            }else if (i%3==0){
                lqxArray.add(poker);
            }else if (i%3==1){
                lyArray.add(poker);
            }else {
               fqyArray.add(poker);
            }
        }

        //看牌，三个玩家分别遍历自己的牌
        lookPoker("林青霞",lqxArray);
        lookPoker("柳岩",lyArray);
        lookPoker("风清扬",fqyArray);

        lookPoker("底牌",dpArray);


        //System.out.println(array);
    }

    //看牌的方法

    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for (String poker :array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
