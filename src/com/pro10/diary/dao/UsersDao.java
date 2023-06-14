package com.pro10.diary.dao;

import com.pro10.diary.entity.Users;

import java.sql.ResultSet;
import java.sql.SQLException;

//数据操作类，用来封装与数据表users相关的所有操作，如: 判断登录、注册、根据id查询用户信息、修改用户信息
public class UsersDao {
    ConnDB conn = new ConnDB();

    //判断登录，代入用户名和密码，返回查询到的用户对象。如果返回的对象为null就说明不能登录
    public Users login(String name, String pwd) {
        Users user = null;        //返回的Users对象
        String sql = "select * from users where userID=? and userPwd=?";
        Object[] objs = {name, pwd};    //name、pwd的值对应sql中的?
        ResultSet rs = conn.executeQuery(sql, objs);    //执行查询，返回结果集
        //将rs中的数据取出来，封装成一个Users对象
        try {
            if (rs.next())     //如果有数据，也只可能有1条
            {
                String userID = rs.getString("userID");
                String userPwd = rs.getString("userPwd");
                String userSex = rs.getString("userSex");
                String userQQ = rs.getString("userQQ");
                String userEmail = rs.getString("userEmail");
                int userAge = rs.getInt("userAge");
                //将查询到的1条用户信息，封装成一个Users对象
                user = new Users(userID, userPwd, userSex,
                        userQQ, userEmail, userAge);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return user;
    }

    //注册
    public int register(String userID, String userPwd,
                        String userSex, String userQQ, String userEmail, int userAge) {
        return 0;
    }

    public int register(Users user) {
        return 0;
    }

}
