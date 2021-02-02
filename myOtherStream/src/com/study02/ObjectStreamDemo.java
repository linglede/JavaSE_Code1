package com.study02;

import com.study01.SystemOutDemo;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        write();
        read();
    }

    //反序列化

    private static void read() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JavaSE_Code\\myOtherStream\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }

    //序列化

    private static void write()throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaSE_Code\\myOtherStream\\oos.txt"));

        Student s = new Student("aaa",22);
        oos.writeObject(s);
        oos.close();
    }
}
