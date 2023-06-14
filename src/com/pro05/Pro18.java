package com.pro05;

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    //等待用户输入一个整数
        //调用方法
        Pro18 t = new Pro18();
        boolean f = t.primeNumber(a); //用"对象.普通方法名(参数)"来调用方法

        if (f == true)        //if(t.primeNumber(a)==true)
        {
            System.out.println(a + " 是素数!");
        } else {
            System.out.println(a + " 不是素数!");
        }
    }

    //1、写一个方法，判断某个整数是不是素数（只能被1和它自己除尽的整数叫素数）；
    public boolean primeNumber(int x) {
        boolean flag = true;    //先假定x是素数
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0)    //除尽了，不是素数
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}