package com.pro05;

public class Pro13 {
    public static void main(String[] args) {
        int[][] cp = {
                {4, 19, 22, 26, 29, 30, 11},
                {2, 6, 8, 10, 11, 17, 13},
                {3, 13, 15, 19, 20, 27, 14},
                {15, 16, 21, 27, 30, 33, 4},
                {1, 8, 23, 25, 28, 29, 10},
                {1, 10, 14, 15, 18, 31, 13},
                {3, 7, 11, 21, 30, 33, 7},
                {2, 5, 7, 8, 20, 27, 4},
                {2, 12, 13, 23, 27, 28, 12},
                {3, 11, 17, 18, 24, 25, 6},
                {4, 11, 18, 19, 26, 32, 4},
                {4, 5, 24, 28, 30, 33, 9},
                {5, 7, 9, 11, 19, 25, 5},
                {11, 15, 16, 20, 24, 31, 4},
                {1, 2, 3, 14, 19, 33, 3},
                {5, 7, 14, 16, 18, 21, 1},
                {7, 10, 21, 23, 31, 33, 14},
                {10, 13, 19, 21, 24, 30, 7},
                {2, 4, 5, 8, 11, 30, 2},
                {1, 7, 10, 22, 31, 32, 15},
                {2, 6, 9, 13, 28, 32, 12},
                {6, 10, 14, 15, 19, 23, 15},
                {1, 5, 10, 19, 26, 28, 12},
                {21, 22, 26, 28, 31, 32, 7},
                {8, 12, 16, 19, 26, 32, 3},
                {13, 17, 20, 21, 22, 27, 1},
                {4, 5, 6, 8, 9, 18, 11},
                {6, 10, 13, 15, 32, 33, 15},
                {1, 7, 17, 23, 25, 31, 11},
                {4, 14, 16, 23, 28, 29, 3}
        };
        //用red[1]~red[33]记录红色号码1~33出现的次数
        int[] red = new int[34];
        //用blue[1]~blue[16]记录蓝色号码1~16出现的次数
        int[] blue = new int[17];
        int x;
        //访问彩票数据的每一行
        for (int i = 0; i < cp.length; i++) {
            //访问第i行前6个红色号码
            for (int j = 0; j < 6; j++) {
                x = cp[i][j];    //取出一个红色号码
                red[x]++;    //红色号码x出现的次数加1
            }
            //访问第i行的第7个数，它是蓝色号码
            x = cp[i][6];    //第i行的最后一个数据，就是蓝色号码
            blue[x]++;        //蓝色号码x出现的次数加1
        }
        //输出
        for (int i = 1; i < red.length; i++) {
            System.out.println("红色号码 " + i + " 出现的次数是: " + red[i]);
        }
        System.out.println("----------------------");
        for (int i = 1; i < blue.length; i++) {
            System.out.println("蓝色号码 " + i + " 出现的次数是: " + blue[i]);
        }
    }

}