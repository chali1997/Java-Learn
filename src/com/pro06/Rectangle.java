package com.pro06;

//1、定义一个矩形类，要求能存储矩形的长、宽，能求出矩形的面积。
public class Rectangle {
    //1.字段，成员变量
    private int length;
    private int width;

    //2.构造方法
    public Rectangle() {
    }    //默认的空构造方法

    public Rectangle(int length, int width)    //重载的构造方法
    {
        //左边this.length指类的成员变量，右边length指方法中代入的形式参数
        this.length = length;
        this.width = width;
    }

    //3.自定义方法
    public int findTheArea()            //用对象自己的数据，来求面积
    {
        return this.length * width;
    }

    //重载方法，用代入的数据，求其它矩形的面积
    public int findTheArea(int length, int width) {
        return length * width;
    }

    public int findPerimeter() {
        return 2 * (length + width);    //return 2*(this.length+this.width);
    }

    public int findPerimeter(int length, int width) {
        //这里的length指方法带入的参数，this.length才是类的成员变量
        return 2 * (length + width);
    }

    //4.getter和setter方法，决定了成员变量的外部访问权限

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}