package com.pro06;

public class Pro04 {
    public static void main(String[] args) {
        //创建Student4对象
        Student4 student1 = new Student4("0001", "张三", 19);
        String s1 = student1.output();    //调用自定义方法，获得学生信息
        System.out.println("学生对象:\n" + s1);

        Undergraduate undergraduate = new Undergraduate("0002", "李四", 21, "软件技术");
        /*
        undergraduate.setName("王五");	//调用从父类继承的setter方法，修改姓名
        undergraduate.setAge(18);
        String s2=undergraduate.output();	//调用从父类继承的方法，获得信息
        */
        String s2 = undergraduate.output();    //调用覆盖后的output()方法，获得信息
        System.out.println("本科生对象:\n" + s2);
    }
}
