package com.pro10.diary.view;

import com.pro10.diary.dao.DiaryDao;
import com.pro10.diary.dao.UsersDao;
import com.pro10.diary.entity.Diary;
import com.pro10.diary.entity.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame implements ActionListener {
    //成员变量
    private JLabel javaLabelName, javaLabelPassword;        //标签，显示不可编辑的文字
    private JTextField javaTextFieldName;    //文本框，输入文字
    private JPasswordField javaPasswordFieldPassword;            //密码框
    private JButton javaButtonLogin;    //按钮

    //构造函数，一般在构造函数中设置好窗口属性，创建对象时就会生成一个窗口
    public Login(String title) {
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
        com.pro10.diary.view.Login login = new com.pro10.diary.view.Login("用户登录");
    }

    //按钮单击事件的处理方法
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //JOptionPane.showMessageDialog(this, "你好");	//弹出消息
        //在这里写登录判断的代码，弹出消息
        String name = this.javaTextFieldName.getText();    //取出用户名
        String pwd = new String(this.javaPasswordFieldPassword.getPassword());    //取出密码
        UsersDao usersDao = new UsersDao();
        Users user = usersDao.login(name, pwd);    //调用自定义方法，判断登录
        if (user != null)    //登录成功
        {
            //登录成功后，查询该用户发表的所有日志
            DiaryDao diaryDao = new DiaryDao();
            ArrayList<Diary> al = diaryDao.getDiaryByAuthor(user.getUserID());
            //输出查询出来的日志
            for (Diary d : al)    //循环取出al中的每个Diary对象
            {
                String s = String.format("%d, %s, %s, %s, %s", d.getDiaryID(),
                        d.getDiaryTitle(), d.getPostDate(), d.getPub(), d.getAuthor());
                System.out.println(s);
            }
            JOptionPane.showMessageDialog(this, "登录成功！");
        } else {
            JOptionPane.showMessageDialog(this, "用户名或密码错误！");
        }
    }
}
