package com.pro02;

public class Pro02 {
    //1、定义多个变量存储某学生的学号(1801170641)、姓名(张三)、
    //性别(男)、年龄(19)、身高(1.75)，然后输出。
    public static void main(String[] args) {
        String studentNumber = "1801170641";    //学号
        String name = "张三";
        char sex = '男';
        int age = 19;
        float height = 1.75f;        //身高

        System.out.println("学号:" + studentNumber + "\n姓名:" + name + "\n性别:"
                + sex + "\n年龄:" + age + "\n身高:" + height);
    }
}
