package com.studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();
        //用循环回到主界面
        while (true) {
            //用输出语句完成主界面
            System.out.println("--------欢迎来到学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘输入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    searchStudent(array);
                    break;
                case "5":
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("输入数字错误！");
            }

        }
    }
    //添加
    public static void addStudent(ArrayList<Student> array){
        String sid;
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("学号已被使用，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加成功");


    }
    //删除
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入要删除学生的学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号：");
        String sid = sc.nextLine();

        //遍历集合，将对应的学生对象从集合中删除
        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.remove(i);
                System.out.println("删除成功");
                break;
            }else{
                System.out.println("不存在该学号！");
            }

        }

    }
    //更新
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        String sid = sc.nextLine();

        //键盘输入要修改的学生信息
        System.out.println("请输入新的学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新的学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新的学生居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应的学生信息
        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }

        System.out.println("修改成功");

    }
    //查找
    public static void searchStudent(ArrayList<Student> array){
        //判断集合中是否有信息
        if (array.size()==0){
            System.out.println("无信息，请先添加信息再查看");
            //直接返回
            return;

        }
        //显示表头信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t\t居住地");

        //将集合中数据取出，按照对应格式要求显示学生信息，年龄补充“岁”
        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            System.out.println(student.getSid()+"\t\t"+student.getName()+"\t\t"+student.getAge()+"岁\t\t"+student.getAddress());
        }

    }
    //判断学号是否被占用
    public static boolean isUsed(ArrayList<Student> array,String sid) {
        //如果与集合中某个学生学号相同，返回true,如果不相同返回false
        boolean flag = false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
