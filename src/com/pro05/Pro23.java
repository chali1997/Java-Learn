package com.pro05;

public class Pro23 {
    public static void main(String[] args) {
        int n = 1, s;
        Pro23 t = new Pro23();
        s = t.peach2(n);
        System.out.println("第" + n + "天的桃子数量是:" + s);
    }

    //n代表第几天，返回这一天的桃子数量
    public int peach1(int n)    //非递归的求，即一般求法
    {
        int s = 1;    //第10天剩下1个桃子
        for (int i = 9; i >= n; i--)    //从第9天递减到第n天
        {/*	s9,s10;
			s9/2-1=s10;
			s9/2=s10+1;
			s9=2*(s10+1);
			*/
            s = 2 * (s + 1);
        }
        return s;
    }

    //4.3 猴子第一天摘了若干个桃子，当即吃了一半，还不解馋，又多吃了一个；
    //第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个；
    //以后每天都吃前一天剩下的一半多一个，到第10天想再吃时，只剩下一个桃子了。
    //问第一天共摘了多少个桃子？
    public int peach2(int n)    //递归求法，n小于等于10
    {
        int s;
        if (n == 10) {
            s = 1;        //第10天桃子剩下1个
        } else {
            s = 2 * (peach2(n + 1) + 1);
        }
        return s;
    }
    /* f(n)代表第n天的桃子数量
     * 从n推到n-1
     * f(n-1)/2-1=f(n)
     * f(n)=f(n-1)/2-1
     *
     * 从n推到n+1
     * f(n)/2-1=f(n+1);
     * f(n)=2*(f(n+1)+1)
     */
}