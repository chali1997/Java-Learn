package com.pro05;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pro28 {
    public static void main(String[] args) {
        //2、用java.util.Date类获取当前日期和时间，
        //用SimpleDateFormat类格式化成"yyyy-MM-dd HH:mm:ss"格式，并输出。
        Date dt = new Date();    //以当前日期和时间创建对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.SSS");
        String s = sdf.format(dt);    //将Date对象转换成指定格式的字符串
        System.out.println(s);
    }
}

