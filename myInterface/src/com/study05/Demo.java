package com.study05;

//测试类

public class Demo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(20);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("----------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("==========");

        PingPangPlayer ppp1 = new PingPangPlayer("赛事",12);
        System.out.println(ppp1.getName()+","+ppp1.getAge());
        ppp1.eat();
        ppp1.speak();
        ppp1.study();
        System.out.println("----------");

        BasketballPlayer bp1 = new BasketballPlayer("嘻嘻",22);
        System.out.println(bp1.getName()+","+bp1.getAge());
        bp1.study();
        bp1.eat();
        System.out.println("==========");

        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("jij");
        ppc.setAge(39);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speak();
        System.out.println("------------");

        PingPangCoach ppc1 = new PingPangCoach("dsaf",22);
        System.out.println(ppc1.getName()+","+ppc1.getAge());
        ppc1.teach();
        ppc1.eat();
        ppc1.speak();
        System.out.println("-----------");

        BasketballCoach bc = new BasketballCoach();
        bc.setName("dwdw");
        bc.setAge(33);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("============");

        BasketballCoach bc1 = new BasketballCoach("dddd",22);
        System.out.println(bc1.getName()+","+bc1.getAge());
        bc1.eat();
        bc1.teach();



    }

}
