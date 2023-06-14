package com.pro05;

public class Pro08 {
    public static void main(String[] args) {
        //1.1、给出一个一维整型数组并初始化，求出最大值和最小值，并输出；
        int[] a = {87, -22, 197, 35, 76, 55, 62, 44, 35, 19};
        int zd = a[0], zx = a[0];    //最大、最小的初始必须来自数组内部元素
        for (int i = 0; i < a.length; i++) {
            if (a[i] > zd) {
                zd = a[i];    //谁大就用zd记录下来
            }
            if (a[i] < zx) {
                zx = a[i];
            }
        }
        System.out.println("最大值:" + zd + "\n最小值:" + zx);
    }
}