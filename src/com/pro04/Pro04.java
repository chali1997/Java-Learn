package com.pro04;

import java.util.Scanner;

public class Pro04 {
    public static void main(String[] args) {
        //2、定义一个变量，输入1~7之间的一个值。
        //用switch判断，如果是1~5之间的值就输出“工作日”，如果是6~7之间的值就输出“周末”。
        Scanner sc = new Scanner(System.in); //System.in是系统输入，即键盘
        System.out.print("请输入1~7之间的数字:");
        int w = sc.nextInt();    //要求用户输入一个整数
        switch (w) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("周末");
                break;
            default:
                System.out.println("不是有效的星期数字");
                break;
        }
    }
}
