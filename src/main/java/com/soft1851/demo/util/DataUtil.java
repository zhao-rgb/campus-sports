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
        for (int i = 0;i<2; i++){
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }
}
