package com.pro06;

public class Pro03 {
    public static void main(String[] args) {
        //创建一个矩形对象，输出该矩形的面积。
        Rectangle rectangle1 = new Rectangle(5, 4);    //创建对象时调用构造方法，对长、宽初始化
        int area = rectangle1.findTheArea();    //调用自定义方法，求面积
        int perimeter1 = rectangle1.findPerimeter();
        System.out.println("矩形1的面积是:" + area + ", 周长是:" + perimeter1);

        Rectangle rectangle2 = new Rectangle();    //调用默认的构造方法，没有初始化长、宽
        rectangle2.setLength(8);    //设置长为8
        rectangle2.setWidth(3);    //设置宽为3
        int area2 = rectangle2.findTheArea();
        int perimeter2 = rectangle2.findPerimeter();
        System.out.println("矩形2的面积是:" + area2 + ", 周长是:" + perimeter2);

        //int area3=rectangle2.findTheArea(10, 4);	//用对象rectangle2求其它矩形的面积
    }
}
