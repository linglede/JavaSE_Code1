package com.study04;

public class Outer {

    public void method(){
        /*
        //仅仅是对象
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        */

        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/

        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();
    }
}
