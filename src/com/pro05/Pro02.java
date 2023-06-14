package com.pro05;

public class Pro02 {
    public static void main(String[] args) {
        //4、输出1~30之间所有3的倍数的数。
        for (int i = 1; i <= 30; i++)    //i的取值从1递增到30
        {
            if (i % 3 == 0)    //除3除尽了
            {
                System.out.print(i + ",");
            }
        }
    }

}