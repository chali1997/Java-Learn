package com.pro04;

public class Pro03 {
    public static void main(String[] args) {
        int year = 2012;
        if (year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
