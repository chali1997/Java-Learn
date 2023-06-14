package com.pro05;

public class Pro12 {
    /*3、将二维数组
    {
        { 1,2, 3, 4},
        { 5, 6, 7, 8},
        { 9, 10, 11, 12},
        {13, 14, 15,16}
    }
    沿某个对角线（1,6,11,16或4,7,10,13）对折。
    */
    public static void main(String[] args) {
        //沿对角线（1,6,11,16）对折，其实是把a[i][j]与a[j][i]数据对换
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int temp;    //用于临时交换数据
        for (int i = 0; i < a.length; i++) {
            //for(int j=0; j<a[i].length; j++)
            for (int j = 0; j < i; j++) {
                //将a[i][j]与a[j][i]对换
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        //输出
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();    //换行
        }
    }

}