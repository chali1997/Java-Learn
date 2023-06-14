package com.pro05;

import java.util.Random;

public class Pro24 {
    //6、用Random类的nextInt()方法，产生一组双色球彩票。
    //双色球彩票前6个数字是1~33之间的数，第7个数字是1~16之间的数。
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(32) + 1;    //1~33
        int y = rd.nextInt(15) + 1;    //1~16
        System.out.println("x=" + x + ",y=" + y);
    }

}