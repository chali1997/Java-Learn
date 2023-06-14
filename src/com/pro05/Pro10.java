package com.pro05;

public class Pro10 {
    public static void main(String[] args) {
        //2、给出一个二维整型数组并初始化，按行、列形式输出所有元素。
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < a.length; i++) //访问每一行,a.length指行数
        {
            //访问第i行的每一列, a[i].length是第i行的元素个数，即列数
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();    //输出换行
        }
    }

}