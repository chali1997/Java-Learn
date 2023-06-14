package com.pro06;

public class Pro02 {
    public static void main(String[] args) {
        //使用Student类
        Student2 student = new Student2(); //用默认的构造方法，创建对象
        student.studentID = "1801170641";
        student.name = "张三";
        student.sex = '男';
        student.age = 19;
        student.height = 1.75F;

        String s2 = student.getInfo();    //调用Student类中定义的getInfo()方法
        System.out.println(s2);
    }
}

//3、定义一个变量存储某学生的学号(1801170641)、姓名(张三)、性别(男)、年龄(19)、
//身高(1.75)，并提供获取和修改学生信息的功能。然后调用某功能获取该学生的所有信息，并输出。
class Student2        //定义一个类
{
    //字段,属性,成员变量
    public String studentID;
    public String name;
    public char sex;
    public int age;
    public float height;

    //成员方法(功能)
    public String getInfo() {
        //String s = String.format("学号:%s\n姓名:%s\n性别:%c\n年龄:%d\n身高:%f\n",
        //		studentID, name, sex, age, height);
        String s = "学号:" + studentID + "\n姓名:" + name + "\n性别:"
                + sex + "年龄:" + age + "\n身高:" + height;
        return s;
    }
}
