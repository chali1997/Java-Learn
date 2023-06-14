package com.pro03;

public class Pro02 {
    public static void main(String[] args) {
        int score = 45;
        String s = score >= 60 ? "及格" : "不及格";    //右侧是一个条件表达式
        System.out.println(s);

        //定义一个年份year，判断它是不是闰年。用if语句
        //闰年：要么能被400除尽		year%400==0
        //或者能被4除尽但不能被100除尽	year%4==0 && year%100!=0
        int year = 2012;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
