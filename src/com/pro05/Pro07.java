package com.pro05;

public class Pro07 {
    public static void main(String[] args) {
        //1、给出一个一维整型数组并初始化，输出每个元素；
        int[] a = {87, 22, 97, 35, 76, 55, 62, 44, 35, 19};
        for (int i = 0; i < a.length; i++)    //循环访问每个数组元素的下标/索引
        {
            System.out.print(a[i] + ", ");    //第i个元素
        }
    }

}