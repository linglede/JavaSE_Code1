package com.study_05;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p = new Phone();
        p.call("ada");
        System.out.println("--------");
        NewPhone np = new NewPhone();
        np.call("ada1");
    }
}
