package com.study02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/*NotSerializableException:抛出一个实例需要一个Serializable接口。序列化运行时或实例的类可能会抛出此异常
* */

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个写入指定OutputStream的ObjectOutputStream
       //对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaSE_Code\\myOtherStream\\oos.txt"));

        //创建对象
        Student s = new Student("aaa",22);

        //void writeObject(Object obj):将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        oos.close();
    }
}
