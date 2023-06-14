package com.pro09;

import java.util.HashMap;

public class Pro03 {
    //向HashMap中存入键值对，再取出
    public static void main(String[] args) {
        //用HashMap存储1个学生的信息
        HashMap map = new HashMap();
        map.put("studentNumber", "1001"); //键studentNumber，值1001
        map.put("studentName", "张三");
        map.put("studentSex", '男');
        map.put("studentAge", 19);
        map.put("studentHeight", 1.75);
        Object ob = map.get("studentHeight"); //通过键studentHeight取出对应的值
        double height = (double) ob; //强制将取出的Object数据，转换回原来的double类型
        map.put("studentName", "李四");
        String s = String.format("学号:%s\n姓名:%s\n性别:%c\n年龄:%d\n身高:%f\n",
                map.get("studentNumber"), map.get("studentName"), map.get("studentSex"),
                map.get("studentAge"), height);
        System.out.println(s);
    }
}
