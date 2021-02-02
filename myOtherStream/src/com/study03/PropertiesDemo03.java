package com.study03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03 {
    public static void main(String[] args)throws IOException {
        //把集合中的数据保存到文件
        //myStore();

        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        FileReader fr = new FileReader("D:\\JavaSE_Code\\myOtherStream\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("001","aaa");
        prop.setProperty("002","bbb");
        prop.setProperty("003","ccc");

        //void store(Writer writer,String comments)
        FileWriter fw = new FileWriter("D:\\JavaSE_Code\\myOtherStream\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
