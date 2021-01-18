package com.study02;

/**
 * @author 17910
 */
//public class InterImpl implements Inter {
    //等价

public class InterImpl extends Object implements Inter{
    public InterImpl(){
        super();
    }

    @Override
    public void method() {
        System.out.println("InterImol 的method");
    }
}
