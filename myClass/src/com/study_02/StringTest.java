package com.study_02;

import java.util.Scanner;

/**
 * @author 17910
 */
public class StringTest {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串即可
        String username = "xiongmin";
        String password = "123456";

        for(int i=0;i<3;i++){
        //键盘录入数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

        //比较
            if(name.equals(username)&&pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                if (2 - i == 0) {
                    System.out.println("你的账户被锁定，请与管理员联系");

                } else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
