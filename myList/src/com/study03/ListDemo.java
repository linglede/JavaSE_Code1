package com.study03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();

            //添加元素
            list.add("hello");
            list.add("world");
            list.add("java");

            //遍历集合,
            // 该情况下有ConcurrentModificatonException:当不允许这样修改时，可以通过检测到对象的并发修改方法来抛出异常
           /* Iterator<String> it = list.iterator();
            while(it.hasNext()){
                String s = it.next();
                if(s.equals("world")){
                    list.add("javaee");
                }
            }*/

           for (int i=0;i<list.size();i++){
               String s = list.get(i);
               if (s.equals("world")){
                   list.add("javaee");
               }
           }

            System.out.println(list);
        }
}
