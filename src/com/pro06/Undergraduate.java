package com.pro06;

//写一个本科生类继承学生类，它除了有学生类的学号、姓名、年龄外，
//还多一个字段：专业。覆盖继承得到的output()方法，返回本科生信息。
public class Undergraduate extends Student4 {
    //字段，成员变量。父类Student4的studentID、name、age没有被继承，因为它们是私有的
    private String major;

    //构造函数
    public Undergraduate() {
    }

    public Undergraduate(String studentID, String name,
                         int age, String major) {
        //调用父类的构造函数，给父类中的私有变量赋值
        super(studentID, name, age);    //调用父类的构造函数，必须是第一句
        this.major = major;
    }

    //覆盖父类中的output()方法
    @Override
    public String output() {
        //super.output()调用父类的output()方法，实现代码复用
        String s = super.output() + ", 专业:" + major;
        return s;
    }

    //getter和setter方法

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}