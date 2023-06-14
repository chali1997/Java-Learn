package com.pro05;

public class Pro19 {
    public static void main(String[] args) {
        //使用方法,调用方法
        int[] b = {19, 23, 98, 33, -1, 22, 38, 59};
        Pro19 t = new Pro19();    //创建对象
        int zx = t.getMin(b);    //错误t.getMin(int[] b)
        //错误，不能在静态方法中，直接通过名字访问同一类中的普通方法int zx = getMin(b);
        System.out.println("最小值:" + zx);

        Pro19.output(b);    //类.静态方法()
        output(b);    //也可以在静态方法中，直接通过名字访问另一个静态方法(同一类中)
    }

    //输出一维整型数组
    public static void output(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

    //2、写一个方法，求给定一维整型数组元素中的最小值；
    public int getMin(int[] a) {
        int min = a[0];    //记录最小值，用a[0]作为最初的参照
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];    //找到更小的，用min记录下来
            }
        }
        return min;
    }
}