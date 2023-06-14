package com.pro05;

public class Pro20 {
    public static void main(String[] args) {
        int[] b = {75, 28, 96, 33, 19, 83, 25, 44};
        //bubbling(b);	//不能在静态方法中，直接通过方法名调用非静态方法
        Pro20 t = new Pro20();    //创建对象
        t.bubbling(b);        //排序
        t.output(b);        //输出

        System.out.println("\n----------------------");
        double[] c = {3.14, 5.7, 6.9, 2.8, 9.0, 7.2, 4.3};
        t.bubbling(c);
        t.output(c);
    }

    //3、写一个方法，该方法可以对一维整型数组元素进行排序；
    public void bubbling(int[] a)    //从小到大排序
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            //希望随着i的值变大，每次循环时j的循环范围会缩小1个元素
            for (int j = 0; j < n - i - 1; j++) {
                //i=0, j的循环范围是:0~n-2
                //i=n-1, j的循环范围是: 0~0
                //将a[j]与a[j+1]比较，判断它们的大小顺序对不对
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //3.2、写一个方法，该方法可以对一维double类型数组元素进行排序。
    public void bubbling(double[] a)    //从小到大排序
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            //希望随着i的值变大，每次循环时j的循环范围会缩小1个元素
            for (int j = 0; j < n - i - 1; j++) {
                //将a[j]与a[j+1]比较，判断它们的大小顺序对不对
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //输出一维整型数组
    public void output(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    //方法的重载：同一个类中有多个同名的方法，它们的参数不一样
    public void output(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}