package com.pro05;

public class Pro03 {
    public static void main(String[] args) {
        //5、水仙花数是指一个三位数其各位数字的立方和等于该数本身,例如153是水仙花数。
        //请求出所有水仙花数，并输出。
        //思路：让变量i从最小三位数100循环到最大三位数999，再取出i的个位、十位、百位,
        //然后再判断是不是满足水仙花数的要求。
        int abc, a, b, c;
        for (abc = 100; abc < 1000; abc++) {
            //针对abc取到的每一个值，取出它的个位、十位、百位
            a = abc / 100;    //543/100->5
            b = (abc % 100) / 10;    //(abc/10)%10
            c = abc % 10;        //543%10->3
            if (abc == a * a * a + b * b * b + c * c * c)    //满足水仙花数的要求
            {
                System.out.print(abc + ", ");
            }
        }
    }

}