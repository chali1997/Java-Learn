package com.pro09;

import java.util.ArrayList;

public class Pro02 {
    public static void main(String[] args) {
        //2、定义一个类Student，存储学生信息学号sno、姓名sname、性别sex、年龄age、身高height。
        //创建3个学生对象，依次存入ArrayList<Student>泛型对象中，然后再输出。
        ArrayList<Student> aL = new ArrayList<Student>();
        Student stu1 = new Student("1001", "张三", '男', 19, 1.75F);
        Student stu2 = new Student("1002", "李四", '女', 18, 1.65F);
        Student stu3 = new Student("1003", "王五", '男', 20, 1.80F);
        aL.add(stu1);
        aL.add(stu2);
        aL.add(stu3);
        for (Student st : aL) {
            String s = String.format("学号:%s，姓名:%s，性别:%c，年龄:%d，身高:%f",
                    st.getStudentNumber(), st.getStudentName(), st.getStudentSex(), st.getStudentAge(), st.getStudentHeight());
            System.out.println(s);
        }
        System.out.println("==================================");
        for (int i = 0; i < aL.size(); i++) {
            Student st2 = aL.get(i);
            String s = String.format("学号:%s，姓名:%s，性别:%c，年龄:%d，身高:%f",
                    st2.getStudentNumber(), st2.getStudentName(), st2.getStudentSex(), st2.getStudentAge(), st2.getStudentHeight());
            System.out.println(s);
        }
    }
}
