package com.pro06;

//写一个学生类，它包含的私有字段有：学号、姓名、年龄。
//添加默认构造方法和有参构造方法、自定义方法output()、getter和setter方法，
//其中output()的作用是返回学生的所有信息。
public class Student4 {
    //字段，成员变量
    private String studentID;
    private String name;
    private int age;

    //构造方法/函数
    public Student4() {
    }

    public Student4(String studentID, String name, int age) {
        //super();	//父类的构造方法，所有类的默认父类是Object
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    //自定义方法
    public String output() {
        String s = String.format("学号:%s, 姓名:%s, 年龄:%d",
                studentID, name, age);
        return s;
    }

    //getter和setter方法

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}