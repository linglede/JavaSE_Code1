package com.study_05;

public class NewPhone extends Phone {

    @Override
    public void call(String name){
        System.out.println("开启视频功能");

        super.call(name);
    }
}
