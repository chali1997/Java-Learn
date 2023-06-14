package com.pro05;

import java.util.Calendar;

public class Pro26 {
    //8、用String类的format方法，
    //将当前日期和时间（2023年3月21日8点10分33秒）输出成"2023年03月21日08:10:33"格式的字符串。
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();    //得到当前日期和时间的对象
        int year = cal.get(Calendar.YEAR);    //取出年
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        String s = String.format("%4d年%02d月%02d日%02d:%02d:%02d",
                year, month, day, hour, minute, second);
        System.out.println(s);
    }
}

