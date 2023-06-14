package com.pro08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class PreLogin extends JFrame implements ActionListener {
    //成员变量
    private JLabel javaLabelName, javaLabelPassword;        //标签，显示不可编辑的文字
    private JTextField javaTextFieldName;    //文本框，输入文字
    private JPasswordField javaPasswordFieldPassword;            //密码框
    private JButton javaButtonLogin;    //按钮

    //构造函数，一般在构造函数中设置好窗口属性，创建对象时就会生成一个窗口
    public PreLogin(String title) {
        super(title);    //窗口标题
        this.setBounds(0, 0, 400, 300);    //坐标，宽高

        //获取内容面板，用于管理窗口中的控件
        Container con = this.getContentPane();
        con.setLayout(null);

        //添加标签
        javaLabelName = new JLabel("用户名:");
        javaLabelName.setBounds(50, 30, 80, 25);
        con.add(javaLabelName);
        javaLabelPassword = new JLabel("密  码:");
        javaLabelPassword.setBounds(50, 65, 80, 25);
        con.add(javaLabelPassword);

        //添加文本框
        javaTextFieldName = new JTextField();
        javaTextFieldName.setBounds(130, 30, 200, 25);
        con.add(javaTextFieldName);
        javaPasswordFieldPassword = new JPasswordField();
        javaPasswordFieldPassword.setBounds(130, 65, 200, 25);
        con.add(javaPasswordFieldPassword);

        //添加按钮
        javaButtonLogin = new JButton("登  录");
        javaButtonLogin.setBounds(130, 100, 80, 25);    //设置坐标和宽高
        con.add(javaButtonLogin);    //添加到面板中
        javaButtonLogin.addActionListener(this);

        //设置默认关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    //设置窗口可见
    }

    //主方法
    public static void main(String[] args) {
        //创建一个窗口对象，就会显示一个窗体
        PreLogin login = new PreLogin("用户登录");
    }

    //按钮单击事件的处理方法
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //JOptionPane.showMessageDialog(this, "message");	//弹出消息
        //在这里写登录判断的代码，弹出消息
        String account = javaTextFieldName.getText();        //获取用户名框中的文字
        char[] ch = javaPasswordFieldPassword.getPassword();    //获取密码框中的文字
        String password = new String(ch);            //得到密码
        //预编译SQL语句，要带入的数据用?代替
        String sql = "SELECT * FROM users WHERE userID=? AND userPwd=?";

        //将sql带到数据库中去查询
        boolean flag = false;
        try {
            //1 加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 创建连接对象   	DriverManager.getConnection("连接字符串", "用户名", "密码");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/diarydb?"
                            + "useUnicode=true&characterEncoding=UTF-8", "root", "88888888");
            //3 创建预编译的语句对象
            PreparedStatement pstm = conn.prepareStatement(sql);
            //3.1 向预编译语句对象中，添加数据
            pstm.setString(1, account);    //向sql中的第1个?处，放入account的值
            pstm.setString(2, password);
            //4 执行SQL语句，分查询和非查询两种情况	stm.executeUpdate("SQL的非查询语句")
            ResultSet rs = pstm.executeQuery();    //执行查询
            //5 判断查询是否有结果，如果有，就说明能登录; 如果没有则不能登录。
            flag = rs.next();    //来到下一行，如果下一行存在的话就返回true，否则返回false
            //6 关闭数据库
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (flag == true)    //查询到数据，能登录
        {
            JOptionPane.showMessageDialog(this, "登录成功！");
        } else {
            JOptionPane.showMessageDialog(this, "用户名或密码错误！");
        }
    }
}
