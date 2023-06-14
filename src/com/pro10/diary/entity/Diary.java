package com.pro10.diary.entity;

//实体类，Diary类中的字段与数据表diary中的字段一一对应
//一个Diary对象，就是数据表diary中的一行数据
public class Diary {
    //成员变量，字段
    private int diaryID;    //日志编号
    private String diaryTitle;    //标题
    private String diaryContent;    //内容
    private String postDate;    //发表日期
    private String pub;            //是否公开
    private String author;        //作者

    public Diary() {
    }

    public Diary(int diaryID, String diaryTitle, String diaryContent,
                 String postDate, String pub, String author) {
        super();
        this.diaryID = diaryID;
        this.diaryTitle = diaryTitle;
        this.diaryContent = diaryContent;
        this.postDate = postDate;
        this.pub = pub;
        this.author = author;
    }

    public int getDiaryID() {
        return diaryID;
    }

    public void setDiaryID(int diaryID) {
        this.diaryID = diaryID;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle;
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
