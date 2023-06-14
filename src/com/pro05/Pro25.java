package com.pro05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pro25 {
    //7、分别用java.util.Date类、Calendar获取当前日期和时间，
    //用SimpleDateFormat类格式化成"yyyy-MM-dd HH:mm:ss"格式。
    public static void main(String[] args) {
        Date d1 = new Date();    //获取当前日期和时间
        //SimpleDateFormat类用来将日期和时间对象，转换成一定格式的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat类的format(Date对象)，就能将Date对象转换成指定的字符串
        String s = sdf.format(d1);
        System.out.println(s);
    }

}