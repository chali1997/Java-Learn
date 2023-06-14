package com.pro03;

public class Pro01 {
    public static void main(String[] args) {
        //1、定义一个变量score存储成绩，并输入0~100之间的一个值。
        //用if判断，对应输出“不及格（0-59）”、“及格（60-74）”、“良好（75-89）”、“优秀（90-100）”。
        int score = 98;
        if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 75) {
            System.out.println("及格");
        } else if (score >= 75 && score < 90) {
            System.out.println("良好");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else {
            System.out.println("无效的成绩！");    //<0 || >100
        }
    }
}
