package com.pro08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author some
 */
public class Pro01 {
    public static void main(String[] args) {
        try {
            //1 加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2 创建连接对象   DriverManager.getConnection("连接字符串", "用户名", "密码");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/diarydb"
                            + "?useUnicode=true&characterEncoding=UTF-8", "root", "88888888");

            //3 创建语句对象
            Statement stm = conn.createStatement();

            //4 执行SQL语句，分查询和非查询两种情况   stm.executeUpdate("SQL的非查询语句")
            String s = "insert into users(userID,userPwd,userSex,userAge)"
                    + "  values('xiaoming222', '123', '男', 21)";
            stm.executeUpdate(s);

            //5 关闭数据库
            conn.close();

            System.out.println("执行成功！");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
