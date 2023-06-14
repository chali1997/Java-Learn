package com.pro05;

import java.util.Calendar;


public class Pro29 {
    public static void main(String[] args) {
        //3、用String类的format方法，将当前日期和时间格式化成
        //"2023年3月21日8点10分33秒"形式的字符串，并输出。
        //可以用Calendar获取当前日期和时间。
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);    //获取年份
        int month = cal.get(Calendar.MONTH) + 1;    //月
        int day = cal.get(Calendar.DAY_OF_MONTH);    //天
        int hour = cal.get(Calendar.HOUR_OF_DAY);    //小时

        //String s=String.format("想要的格式", 参数列表arg1, arg2, ....);
        String s = String.format("%4d年%02d月%02d日%02d小时", year, month, day, hour);
        System.out.println(s);
    }

}