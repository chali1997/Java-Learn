//数据库基础操作类，该类封装了最基础的数据库操作，如得到连接对象、执行查询、执行非查询、关闭连接
//一般情况，该类的对象会被XXXDao类来调用，XXXDao类只需要给出SQL语句，ConnDB就帮助执行该语句
package com.pro10.diary.dao;

import java.sql.*;

public class ConnDB {
    private String className = "com.mysql.jdbc.Driver";    //驱动类路径
    private String connStr = "jdbc:mysql://localhost:3306/diarydb?useUnicode=true&characterEncoding=UTF-8";    //连接字符串
    private String userName = "root";    //数据库登录用户名
    private String userPwd = "";        //密码

    private Connection conn = null;    //连接对象
    private Statement stm = null;
    private PreparedStatement pstm = null;
    private ResultSet rs = null;


    //建立连接，返回连接对象
    public Connection getConnection() {
        Connection conn1 = null;
        try {
            //1 加载驱动类
            Class.forName(className);
            //2 创建连接对象   	DriverManager.getConnection("连接字符串", "用户名", "密码");
            conn1 = DriverManager.getConnection(connStr, userName, userPwd);
        } catch (Exception ex) {
            System.err.print(ex.getMessage());    //将异常信息写入错误流
        }
        return conn1;
    }

    //代入预编译的非查询语句和点位符的值组成的数组，用PreparedStatement对象执行，返回受影响的行数
    public int executeUpdate(String sql, Object[] objs) {
        int x = 0;
        try {
            conn = this.getConnection();
            pstm = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++)    //给每个点位符?处代入数据
            {
                pstm.setObject(i + 1, objs[i]);
            }
            x = pstm.executeUpdate();            //执行成功，返回受影响的行数
        } catch (Exception e) {
            x = -1;    //如果发生异常，则返回 -1
            System.out.print(e.getMessage());    //将异常信息写入错误流
        } finally {
            this.close();
        }
        return x;
    }

    //代入查询语句，用Statement对象执行，返回查询结果
    public ResultSet executeQuery(String sql, Object[] objs) {
        try {
            conn = this.getConnection();
            pstm = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                pstm.setObject(i + 1, objs[i]);
            }
            rs = pstm.executeQuery();
        } catch (Exception e) {
            System.err.print(e.getMessage());    //将异常信息写入错误流
        }
        return rs;
    }

    //代入查询语句，判断是否能查询到结果
    public boolean hasRecord(String sql, Object[] objs) {
        boolean flag = false;    //返回结果，true表示有记录，false表示没有

        try {
            conn = this.getConnection();
            pstm = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                pstm.setObject(i + 1, objs[i]);
            }
            rs = pstm.executeQuery();
            flag = rs.next();        //判断下一行有没有数据
        } catch (Exception e) {
            System.err.print(e.getMessage());    //将异常信息写入错误流
        } finally {
            this.close();
        }
        return flag;
    }

    //关闭所有数据库对象
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());    //将异常信息写入错误流
        }
    }
}
