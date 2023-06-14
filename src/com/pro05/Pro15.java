package com.pro05;

public class Pro15 {
    public static void main(String[] args) {
        //1、定义一个一维整型数组并初始化，
        //判断数组元素是不是素数（只能把1和它本身除尽的数），如果是就输出。
        int[] a = {11, 15, 22, 23, 29, 30, 33, 41, 45};
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;    //先假定a[i]是素数
            for (int j = 2; j <= a[i] - 1; j++)    //j从2递增到a[i]-1
            {
                if (a[i] % j == 0)    //除尽了，说明a[i]不是素数
                {
                    flag = false;
                    break;        //跳出最近一层的for语句
                }
            }
            if (flag == true)        //从未除尽过
            {
                System.out.print(a[i] + ",");
            }
        }

    }

}

