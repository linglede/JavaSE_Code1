package com.study02;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) throws ScoreException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        t.checkScore(score);
    }
}
