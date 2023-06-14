package com.pro05;

import java.util.Scanner;

public class Pro16 {
    public static void main(String[] args) {
        //2、本题要求实现一个求整数的逆序数，如输入1234，得到4321，然后输出。
        System.out.print("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();    //等待用户输入一个整数
        int y = 0;    //存储x的逆序数
        int gw;    //存储个位数
        while (x > 0)    //只要x还大于0，就继续循环
        {
            gw = x % 10;    //取出x的个位
            x = x / 10;    //去掉个位
            y = y * 10 + gw;    //每次y乘以10，再加上个位，就能实现逆序
        }
        System.out.println("逆序数是: " + y);
    }

}

