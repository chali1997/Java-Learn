package com.pro06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    //成员变量
    private JLabel javaLabel;    //标签
    private JButton javaButton01, javaButton02;
    private Container con;    //内容面板

    //构造函数
    public MyFrame() {
        this.setBounds(0, 0, 400, 300);
        con = this.getContentPane();    //内容面板
        con.setLayout(null);    //关闭布局

        javaLabel = new JLabel("Hello World!");
        javaLabel.setBounds(0, 0, 100, 50);
        con.add(javaLabel);

        javaButton01 = new JButton("更改文字");        //按钮
        javaButton01.setBounds(0, 70, 100, 30);
        con.add(javaButton01);
        //添加单击事件
        //addActionListener(dx)功能是将单击动作与参数dx中的actionPerformed()方法绑定
        //即单击按钮时，会执行参数dx中的actionPerformed()方法
        //javaButton01.addActionListener(ActionListener接口子类的对象);
        //javaButton01.addActionListener(new Temp());
        javaButton01.addActionListener(this);

        javaButton02 = new JButton("更改颜色");
        javaButton02.setBounds(0, 120, 100, 30);
        con.add(javaButton02);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    //默认关闭操作
        this.setVisible(true);    //显示
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //单击按钮时，会执行下面的代码
        javaLabel.setText("世界，你好！");
    }
}

class Temp implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你单击了按钮");
    }

}