package com.pro05;

import java.util.Scanner;

public class Pro21 {
    public static void main(String[] args) {
        System.out.print("请输入一个小于15的正整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();    //等待用户输入一个整数

        Pro21 t = new Pro21();
        int s = t.factorial(x);
        System.out.println(x + " 的阶乘是: " + s);
    }

    //4、写一个递归方法，该方法能求出n（n<=10）的阶乘；
    public int factorial(int n)    //1*2*...*n
    {
        int sum;    //存储阶乘的结果
        if (n == 1) {
            sum = 1;    //1 的阶乘结果是1
        } else {
            sum = n * factorial(n - 1);    //方法调用了它本身，将求n的阶乘变成求n-1的阶乘
        }
        return sum;
    }
}