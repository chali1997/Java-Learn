package com.pro09;

public class Student {
    private String studentNumber;
    private String studentName;
    private char studentSex;
    private int studentAge;
    private double studentHeight;

    public Student(String studentNumber, String studentName, char studentSex, int studentAge, double studentHeight) {
        super();
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentHeight = studentHeight;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(char studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentHeight() {
        return studentHeight;
    }

    public void setStudentHeight(double studentHeight) {
        this.studentHeight = studentHeight;
    }
}
