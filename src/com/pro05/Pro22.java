package com.pro05;

public class Pro22 {
    public static void main(String[] args) {
        int a, n = 8;
        Pro22 t = new Pro22();
        a = t.Fib2(n);
        System.out.println("第 " + n + " 个Fibonacci数是: " + a);
    }

    public int Fib1(int n)    //求第n个Fibonacci数，不用递归
    {
        int x1 = 1, x2 = 1, temp, i, s;    //temp用来暂存数据
        if (n == 1) {
            s = 1;
        } else if (n == 2) {
            s = 1;
        } else {
            i = 3;
            while (i <= n) {
                temp = x2;
                x2 = x1 + x2;
                x1 = temp;    //将x1、x2都往后移1位
                i++;
            }
            s = x2;
        }
        return s;
    }

    //4.2 用递归方法求出第n个Fibonacci数。
    //所谓Fibonacci数列就是满足任一项数字是前两项的和（最开始两项均定义为1）的数列，
    //如1,1,2,3,5,8,13,21,34...
    public int Fib2(int n)    //求第n个Fibonacci数，用递归
    {
        int s = 0;
        if (n == 1)        //第1个Fibonacci数是1
        {
            s = 1;
        } else if (n == 2)    //第2个Fibonacci数是1
        {
            s = 1;
        } else if (n >= 3)    //从第3个Fibonacci数开始，是前面2项之和
        {
            s = Fib2(n - 2) + Fib2(n - 1);    //Fib2()在定义时，调用了它本身，就是递归
        }
        return s;
    }
}