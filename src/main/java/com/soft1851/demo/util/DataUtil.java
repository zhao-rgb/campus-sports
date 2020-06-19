package com.soft1851.demo.util;

import java.util.Random;

/**
 * @author zhao
 * @className DataUtil
 * @Description TODO
 * @Date 2020/6/9
 * @Version 1.0
 **/
public class DataUtil {

    public static String getTime(){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0;i<2; i++){
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    public static String getfat(){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0;i<3; i++){
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    public static String getLocal(){
        String[] genders = new String[]{"校园","在线运动场","动感厅","操场"};
        Random random = new Random();
        int index = random.nextInt(4);
        return genders[index];
    }

    public static String getTypes(){
        String[] genders = new String[]{"训练营","减脂","跑步","瑜伽","体能"};
        Random random = new Random();
        int index = random.nextInt(4);
        return genders[index];
    }


    public static String getDifficulty(){
        String[] genders = new String[]{"K1","K2","K3","K4","K5"};
        Random random = new Random();
        int index = random.nextInt(5);
        return genders[index];
    }

    public static String getTeacherName(){
        String[] genders = new String[]{"马来周杰伦","斯托帕尼","白领福音","健身女神","小阿诺德施瓦辛格"};
        Random random = new Random();
        int index = random.nextInt(5);
        return genders[index];
    }

}
