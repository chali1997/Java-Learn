package com.pro06;

public class Pro01 {
    public static void main(String[] args) {
        //使用Student类
        Student student = new Student(); //用默认的构造方法，创建对象
        student.studentNumber = "1801170641";
        student.name = "张三";
        student.sex = '男';
        student.age = 19;
        student.height = 1.75F;

        System.out.println("姓名:" + student.name + "\n身高:" + student.height);
    }
}

//2、定义一个变量存储某学生的学号(1801170641)、姓名(张三)、
//性别(男)、年龄(19)、身高(1.75)，然后输出。
//类将多个存储数据的变量打包，形成一个新的类型，这个类型叫Student
class Student        //定义一个类
{
    public String studentNumber;
    public String name;
    public char sex;
    public int age;
    public float height;
}
