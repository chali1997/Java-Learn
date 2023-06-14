package com.pro10.diary.dao;

import com.pro10.diary.entity.Diary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//数据操作类，用来封装与数据表diary相关的所有操作，如: 查询某用户的所用日志、发表日志、删除日志、更新日志
public class DiaryDao {
    ConnDB conn = new ConnDB();    //提供最基础的数据库增删查改功能

    //查询某用户发表的所有日志
    public ArrayList<Diary> getDiaryByAuthor(String author) {
        ArrayList<Diary> al = new ArrayList<Diary>();
        String sql = "select * from diary where author=?";
        Object[] objs = {author};
        ResultSet rs = conn.executeQuery(sql, objs);    //查询结果可能有多行数据
        try {
            while (rs.next())    //循环访问每一行数据
            {
                int id = rs.getInt("diaryID");
                String title = rs.getString("diaryTitle");
                String content = rs.getString("diaryContent");
                String date = rs.getString("postDate");
                String pub = rs.getString("pub");
                //将上面的一行数据，封装成一个Diary对象，然后添加到集合中
                Diary diary = new Diary(id, title, content, date, pub, author);
                al.add(diary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return al;
    }

    //通过日志编号id查询日志
    public Diary getDiaryByID(int id) {
        return null;
    }

    //根据编号删除日志
    public int deleteDiary(int id) {
        return 0;
    }
}
