package com.pro05;

import java.util.Scanner;

public class Pro05 {
    public static void main(String[] args) {
        //7、定义一个int变量并输入值，判断它是不是素数（只能被1和它本身整除的数），然后输出结果。
        //判断x是不是素数的思路: 让变量i从2循环到x-1，用x去除以i取到的每一个值，
        //如果除尽了就是说明x不是素数，如果一直都没有除尽，说明x是素数。
        System.out.print("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();    //等待用户输入一个整数

        int primeNumber = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                primeNumber++;
            }
        }
        if (primeNumber == 2)    //是素数，因为x只能把1、x除尽，共2次
        {
            System.out.println(x + " 是素数！");
        } else {
            System.out.println(x + " 不是素数！");
        }
		/*
		boolean flag=true;	//先假定x是素数，true代表x是素数
		for(int i=2; i<=x-1; i++)	//i从2递增到x-1
		{
			if(x%i==0)	//除尽了
			{
				flag=false;		//false代表x不是素数
				break;
			}
		}
		if(flag==true)	//因为只要除尽一次，flag的值就被修改成false
			System.out.println(x + " 是素数！");
		else
			System.out.println(x + " 不是素数！");
		*/
    }
}