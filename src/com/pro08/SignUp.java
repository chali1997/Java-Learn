package com.pro08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener {
    //成员变量
    private JLabel javaLabelName, javaLabelPassword, javaLabelPassword2, javaLabelSex, javaLabelQq, javaLabelEmail, javaLabelAge;
    private JTextField javaTextFieldName, javaTextFieldSex, javaTextFieldQq, javaTextFieldEmail, javaTextFieldAge;    //文本框
    private JPasswordField javaPasswordFieldPassword, javaPasswordFieldPassword2;    //密码框
    private JButton javaButtonReg;

    //构造方法，用于创建窗口及窗口中的控件
    public SignUp() {
        super("用户注册");    //窗口标题
        this.setBounds(0, 0, 400, 400);    //坐标，宽高

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
        javaLabelPassword2 = new JLabel("重复密码:");
        javaLabelPassword2.setBounds(50, 100, 80, 25);
        con.add(javaLabelPassword2);
        javaLabelSex = new JLabel("性  别:");
        javaLabelSex.setBounds(50, 135, 80, 25);
        con.add(javaLabelSex);
        javaLabelQq = new JLabel("QQ号码:");
        javaLabelQq.setBounds(50, 170, 80, 25);
        con.add(javaLabelQq);
        javaLabelEmail = new JLabel("Email:");
        javaLabelEmail.setBounds(50, 205, 80, 25);
        con.add(javaLabelEmail);
        javaLabelAge = new JLabel("年  龄:");
        javaLabelAge.setBounds(50, 240, 80, 25);
        con.add(javaLabelAge);

        //添加文本框
        javaTextFieldName = new JTextField();
        javaTextFieldName.setBounds(130, 30, 200, 25);
        con.add(javaTextFieldName);
        javaPasswordFieldPassword = new JPasswordField();
        javaPasswordFieldPassword.setBounds(130, 65, 200, 25);
        con.add(javaPasswordFieldPassword);
        javaPasswordFieldPassword2 = new JPasswordField();
        javaPasswordFieldPassword2.setBounds(130, 100, 200, 25);
        con.add(javaPasswordFieldPassword2);
        javaTextFieldSex = new JTextField();
        javaTextFieldSex.setBounds(130, 135, 200, 25);
        con.add(javaTextFieldSex);
        javaTextFieldQq = new JTextField();
        javaTextFieldQq.setBounds(130, 170, 200, 25);
        con.add(javaTextFieldQq);
        javaTextFieldEmail = new JTextField();
        javaTextFieldEmail.setBounds(130, 205, 200, 25);
        con.add(javaTextFieldEmail);
        javaTextFieldAge = new JTextField();
        javaTextFieldAge.setBounds(130, 240, 200, 25);
        con.add(javaTextFieldAge);

        //添加按钮
        javaButtonReg = new JButton("注  册");
        javaButtonReg.setBounds(130, 275, 80, 25);    //设置坐标和宽高
        con.add(javaButtonReg);    //添加到面板中
        javaButtonReg.addActionListener(this);

        //设置默认关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    //设置窗口可见
    }

    //主方法
    public static void main(String[] args) {
        //创建一个窗口对象，就会显示一个窗体
        SignUp signUp = new SignUp();
    }

    //按钮单击事件的处理方法
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //JOptionPane.showMessageDialog(this, "你好");	//弹出消息
        //在这里写注册的代码，弹出消息
        String account = javaTextFieldName.getText();    //获取用户名
        String password = new String(javaPasswordFieldPassword.getPassword());    //密码
        String password2 = new String(javaPasswordFieldPassword2.getPassword());    //重复密码
        String sex = javaTextFieldSex.getText();    //性别，只能输入男、女、保密
        String qq = javaTextFieldQq.getText();        //QQ号
        String email = javaTextFieldEmail.getText();    //Email地址
        int age = Integer.parseInt(javaTextFieldAge.getText());    //年龄
        //INSERT INTO users VALUES('account','password','sex','qq','email', age)
        String sql1 = String.format(
                "INSERT INTO users VALUES('%s','%s','%s','%s','%s', %d)",
                account, password, sex, qq, email, age);
        String sql2 = String.format("select * from users where userID='%s'", account);
        //将拼出的insert语句执行
        int x = 0;
        try {
            //1 加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 创建连接对象   DriverManager.getConnection("连接字符串", "用户名", "密码");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/diarydb"
                            + "?useUnicode=true&characterEncoding=UTF-8", "root", "88888888");
            //3 创建语句对象
            Statement stm = conn.createStatement();
            //先做查询
            ResultSet rs = stm.executeQuery(sql2);
            if (rs.next() == true)    //说明有查询结果，即用户名已被使用
            {
                x = -2;    //-2代表用户名已被使用
            } else {
                //4 执行SQL语句，分查询和非查询两种情况   stm.executeUpdate("SQL的非查询语句")
                x = stm.executeUpdate(sql1);    //带入insert语句，执行后返回受影响的行数
            }
            //5 关闭数据库
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            x = -1;        //-1代表异常
        } catch (SQLException e) {
            e.printStackTrace();
            x = -1;        //-1代表异常
        }
        if (x > 0)        //注册成功
        {
            JOptionPane.showMessageDialog(this, "注册成功！");
        } else if (x == -2) {
            JOptionPane.showMessageDialog(this, "用户名已被注册！");
        } else if (x == -1) {
            JOptionPane.showMessageDialog(this, "发生了异常！");
        }
    }

}
