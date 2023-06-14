package com.pro02;        //指明该类所在的包

public class Pro01 {        //类名，Java中所代码都以类为单位
    //类变量，它在整个类的范围内有效
    static int z = 10;
    final double PI = 3.14159;    //常量

    public static void main(String[] args)    //主方法，是程序执行的入口
    {
        System.out.println("Hello World!世界，你好！");
        //在方法/函数中定义的变量，它只在方法范围内有效
        int x = 15;
        float x2 = 0.15F;    //单精度
        double y = 3.14;
        String str = "张三";
        char sex = '男';    //'a'
        char c2 = 'a';
        char c3 = '\n';
        boolean t = true;    //false
        if (x > 10) {

        }
        boolean t2 = x > 10;
        if (t2) {

        }

        //变量i只在for的范围内有效
        for (int i = 0; i < 10; i++) {
            y = y + i;
            z = z + i;
        }
    }

    //自定义方法
    public static void f1() {
        z = z + 2;
    }
}
