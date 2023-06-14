package com.pro08;

import java.sql.*;

public class Pro02 {

    public static void main(String[] args) {
        try {
            //1 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");

            //2 创建连接对象   	DriverManager.getConnection("连接字符串", "用户名", "密码");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/diarydb?"
                            + "useUnicode=true&characterEncoding=UTF-8", "root", "");

            //3 创建语句对象
            Statement stm = conn.createStatement();

            //4 执行SQL语句，分查询和非查询两种情况	stm.executeUpdate("SQL的非查询语句")
            //stm.executeUpdate("insert into users(userID,userPwd,userSex,userAge) values('account', 'password', 'sex', age)");
            ResultSet rs = stm.executeQuery("select * from users");    //执行查询

            //5 读取结果集
            while (rs.next() == true)    //来到下一行，如果下一行存在的话就返回true，否则返回false
            {
                //out.print("<br>第一个单元格内容：" + rs.getString(1));	//取出某行的第1个单元格中的内容
                System.out.println(rs.getString(1) + ", " + rs.getString(2)
                        + ", " + rs.getString(3) + ", " + rs.getString(4)
                        + ", " + rs.getString(5) + ", " + rs.getInt(6));

            }

            //6 关闭数据库
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
