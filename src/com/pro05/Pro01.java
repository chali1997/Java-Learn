package com.pro05;

public class Pro01 {
    public static void main(String[] args) {
        //3、用循环结构计算1~10之间所有奇数的和。
		/*
		int s=0;	//存储总和
		for(int i=1; i<=10; i++)	//变量i的值从1递增到10
		{
			if(i%2==1)		//是奇数
				s = s + i;	//s+=i;
		}
		System.out.println("1~10之间的奇数和是: " + s);
		*/
        //------------------
        int s = 0;    //存储总和
        for (int i = 1; i <= 10; i = i + 2)    //变量i的值依次取到1、3、5、7、9
        {
            s = s + i;    //s+=i;
        }
        System.out.println("1~10之间的奇数和是: " + s);
        //------------------
		/*
		int s = 0;
		int i=1;
		while(i<=10)
		{
			if(i%2==1)
				s += i; 	//s = s+i;
			i++;
		}
		System.out.println("1~10之间的奇数和是: " + s);
		*/
    }

}