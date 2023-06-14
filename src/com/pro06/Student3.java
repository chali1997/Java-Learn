package com.pro06;

//权限修饰符  class  类名{  ..... }
public class Student3 {
    //1.字段，属性，成员变量
    private String studentID;    //private私有的，表示只能在这个类中访问
    private String name;
    private char sex;
    private int age;
    private float height;

    //2.构造方法/函数，作用是带入数据，对成员变量初始化
    //特点：用public修饰，方法名与类名一样，没有返回类型(也不是void)，可以重载
    public Student3(String studentID, String name, char sex, int age, float height) {
        //this.studentID是指上面定义的成员变量，
        //右边的studentID是方法中带入的形式参数
        this.studentID = studentID;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    //3. getter和setter方法

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}