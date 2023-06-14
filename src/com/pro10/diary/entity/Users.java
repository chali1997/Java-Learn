package com.pro10.diary.entity;

//实体类，Users类中的字段与数据表users中的字段一一对应
//一个Users对象，就是数据表users中的一行数据
public class Users {
    //字段，成员变量
    private String userID;
    private String userPwd;
    private String userSex;    //只能是男、女、保密
    private String userQQ;
    private String userEmail;
    private int userAge;

    //构造方法/函数
    public Users() {
    }

    public Users(String userID, String userPwd, String userSex,
                 String userQQ, String userEmail, int userAge) {
        this.userID = userID;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userQQ = userQQ;
        this.userEmail = userEmail;
        this.userAge = userAge;
    }

    //getter和setter方法
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
