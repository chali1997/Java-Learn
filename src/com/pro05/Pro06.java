package com.pro05;

public class Pro06 {
    public static void main(String[] args) {
        //8、输出1~100之间的所有素数。
        for (int x = 1; x <= 100; x++) {
            boolean flag = true;    //true代表x是素数
            for (int i = 2; i <= x - 1; i++)    //i从2递增到x-1
            {
                if (x % i == 0)    //除尽了
                {
                    flag = false;        //false代表x不是素数
                    break;
                }
            }
            if (flag == true) {
                System.out.print(x + ", ");
            }
        }
    }
}