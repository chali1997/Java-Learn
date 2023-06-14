package com.pro05;

public class Pro09 {
    public static void main(String[] args) {
        //一组双色球彩票由7个数字组成，前6个是红色号码1~33，第7个是蓝色号码1~16。
        //5、请随机产生一注双色球彩票数字，注意红色号码的数字是不能重复的，程序要避免这个问题。
        //Math.random()返回带正号的 double 值，大于或等于 0.0，小于 1.0。
        //double d = Math.random();	//产生大于等于0，小于1的小数
        //int x=(int)(1+33*d);	//随机产生1~33之间的整数
        //System.out.println(x);

        int[] cp = new int[7];    //申请7个空间，用于存储7个整数
        //前6个是1~33的整数
        for (int i = 0; i < 6; i++) {
            cp[i] = (int) (1 + 33 * Math.random());    //产生一个1~33的整数，存入第i个位置
            //将cp[i]与0~i-1位置上的元素比较，如果有相等的，就将下次产生的随机数存入第i个位置
            for (int j = 0; j <= i - 1; j++) //依次访问0~i-1位置上的元素
            {
                if (cp[i] == cp[j])    //第i个元素与之前的元素相等
                {
                    i = i - 1;    //i--，让下次循环产生的随机数依然存到cp[i]中
                }
            }
        }
        //第7个是1~16的整数
        cp[6] = (int) (1 + 16 * Math.random());    //产生一个1~16的整数
        //输出彩票
        for (int i = 0; i < cp.length; i++) {
            System.out.print(cp[i] + ",");
        }
    }

}