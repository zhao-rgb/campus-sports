package com.soft1851.demo.util;

/**
 * @author zhao
 * @className TimeDemo
 * @Description 时间工具类
 * @Date 2020/6/16
 * @Version 1.0
 **/
public class TimeDemo {

    public static String getTotal(String[] timeList) {
        String timeString = null;
        int hour = 0;
        int min = 0;
        int sec = 0;
        for (int i = 0; i < timeList.length; i++) {
            System.out.println(timeList[i]);
            timeString = timeList[i];
            int firstIndex = timeString.indexOf(':');
            int secondIndex = timeString.lastIndexOf(':');
            hour += Integer.parseInt(timeString.substring(0, firstIndex));
            min += Integer.parseInt(timeString.substring(firstIndex + 1,
                    secondIndex));
            sec += Integer.parseInt(timeString.substring(secondIndex + 1,
                    timeString.length()));
        }
        int secToMin, sec2 = 0;
        int minToHour, min2 = 0;
        if (sec >= 60) {
            secToMin = (sec / 60);
            sec2 = (sec % 60);
            min = min + secToMin;
        }

        if (min >= 60) {
            minToHour = (min / 60);
            min2 = (min % 60);
            hour = hour + minToHour;
            System.out.println(minToHour);
            System.out.println(min2);
        }

        String hString;
        String mString;
        String string;
        if (hour < 10){
            hString = "0" + String.valueOf(hour);
        } else {
            hString = String.valueOf(hour);
        }

        if (min < 10){
            mString = "0" + String.valueOf(min);
        } else if (min2 < 10 && min2 > 0){
            mString = "0" + String.valueOf(min2);
        } else if (min < 60) {
            mString = String.valueOf(min);
        } else if (min2 < 60) {
            mString = String.valueOf(min2);
        } else {
            mString = String.valueOf(min2);
        }

        if (sec < 10){
            string = "0" + String.valueOf(sec);
        } else if(sec2 > 0 && sec2 < 10){
            string = "1" + String.valueOf(sec2);
        } else if(sec < 60) {
            string = String.valueOf(sec);
        } else if(sec2 < 60){
            string = String.valueOf(sec2);
        } else {
            string = String.valueOf(sec2);
        }

        return hString + ":" + mString + ":" + string;
    }

    public static void main(String[] args) {
        String[] timeList={"01:119:59","07:02:01"};
        System.out.println(getTotal(timeList));
    }
}
