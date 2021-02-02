package com.study06;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder((name,age)->{
            return new Student(name,age);
        });

        //引用构造器
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student s = sb.build("dedfe",11);
        System.out.println(s.getName()+","+s.getAge());
    }
}
