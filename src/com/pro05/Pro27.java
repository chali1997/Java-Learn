package com.pro05;

import java.util.Random;

public class Pro27 {
    public static void main(String[] args) {
        //1、Random类的nextInt()方法返回一个-21亿~21亿（2的32次方）的整数。
        //请你用Random类的nextInt()方法(没有参数)产生一个1~33之间的整数并输出。
        Random rd = new Random();    //创建对象
        int x = rd.nextInt();    //返回-21亿~21亿之间的数
        if (x < 0)            //如果x是负数，把它变成正整数
        {
            x = x * -1;
        }
        x = x % 33 + 1;        //1~33
        System.out.println("x=" + x);

        int y = rd.nextInt(32) + 1;    //1~33
        System.out.println("y=" + y);
    }

}

