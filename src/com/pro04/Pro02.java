package com.pro04;

public class Pro02 {
    public static void main(String[] args) {
        //输出1~100，用for、while、do...while
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
        }
        System.out.println();    //换行

        int i = 1;
        while (i <= 100) {
            System.out.print(i + ",");
            i++;    //容易忘写，导致死循环
        }
        System.out.println();    //换行

        i = 1;
        do {
            System.out.print(i + ",");
            i++;
        } while (i <= 100);
        System.out.println();    //换行
    }
}
