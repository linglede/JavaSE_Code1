package com.study03;

/*需求：请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩结束，想玩请充值*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("D:\\JavaSE_Code\\myOtherStream\\game.txt");
        prop.load(fr);
        fr.close();

        //通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        if (number>=3){
            System.out.println("游戏试玩结束，想玩请充值");
        }else{
            GuessNumber.start();
            //次数加1 ，重写回文件，用Properties的store()方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("D:\\JavaSE_Code\\myOtherStream\\game.txt");
            prop.store(fw,null);
            fw.close();
        }

    }
}
