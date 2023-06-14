package com.pro05;

public class Pro17 {
    public static void main(String[] args) {
        //3、输出1~100之间的所有Fibonacci数。
        //所谓Fibonacci数列就是满足任一项数字是前两项的和（最开始两项均定义为1）的数列，
        //如1,1,2,3,5,8,13,21,34...
        int x1 = 1, x2 = 1, temp;    //temp用来临时存储数据
        System.out.print("1,");
        while (x2 < 100)    //while(x1<100 && x2<100)
        {
            System.out.print(x2 + ",");
            temp = x2;    //先把x2的值暂存到temp
            x2 = x1 + x2;    //用x2存储前面2个数相加的值
            x1 = temp;    //用x1存储原来的x2的值
        }
    }
}