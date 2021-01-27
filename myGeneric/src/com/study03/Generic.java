package com.study03;
//泛型类改进
/*public class Generic<T> {
    private T t;
    public void show(T t){
        System.out.println(t);
    }
}*/

//泛型方法

public class Generic{
    public <T> void show(T t){
        System.out.println(t);
    }
}
