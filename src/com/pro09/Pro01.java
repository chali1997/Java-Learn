package com.pro09;

import java.util.ArrayList;

public class Pro01 {
    public static void main(String[] args) {
        // 1、向ArrayList对象中添加个人信息：1001、张三、男、19、1.75，然后输出。
        ArrayList aL = new ArrayList();
        aL.add("1001"); //可以向末尾添加任何类型的数据
        aL.add("张三");
        aL.add('男');
        aL.add(19);
        aL.add(1.75);
        //al.add(其它任何类型的对象);
        //访问ArrayList对象中的所有元素，并输出
        //访问每个元素，但不能修改，只能读取
        for (Object oB : aL) { //取出al中的每个元素，依次放入变量ob中
            System.out.print(oB + ",");
        }
        //如果想取出年龄，并判断，必须把取出的数据强制转换成整数
        int age = (Integer) aL.get(3);
        if (age >= 18) {
            System.out.println("是成年人");
        } else {
            System.out.println("是未成年人");
        }
        for (int i = 0; i < aL.size(); i++) { //取出第i个元素，可修改
            Object oB = aL.get(i);
            System.out.print(oB + ",");
        }

        if (age >= 18) {
            System.out.println("是成年人");
        } else {
            System.out.println("是未成年人");
        }
    }
}
