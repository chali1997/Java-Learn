package com.pro05;

public class Pro04 {
    public static void main(String[] args) {
        //6、输出九九乘法表。
        for (int i = 1; i <= 9; i++)    //循环9行
        {
            for (int j = 1; j <= i; j++) //针对第i行，输出i个式子
            {
                System.out.print(j + "x" + i + "=" + i * j + " ");
            }
            System.out.println();    //输出换行
        }
    }

}