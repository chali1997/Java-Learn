package com.pro12;

import javax.swing.*;
import java.awt.*;

//定义一个JFrame的子类，它也是一个窗体/界面
public class MyFrame extends JFrame {
    //字段，成员变量——这里一般放窗体中的控件，如按钮、文本框
    private JTextField javaTextField;    //文本框
    private JButton javaButton;    //按钮

    //构造函数/方法——一般用来初始化窗体/界面
    public MyFrame() {
        //左顶点坐标(50,250)，长400，宽300
        this.setBounds(50, 250, 400, 300);    //调用从JFrame中继承的方法,this指当前对象
        Container con = this.getContentPane();    //得到内容面板
        con.setLayout(null);    //设置布局方式，这里是按坐标、长宽来排列

        javaTextField = new JTextField("Hello");
        javaTextField.setBounds(10, 50, 100, 30);    //(10,50)是相对于窗体的内容面板的左上角来定位的
        con.add(javaTextField);    //将文本框添加到窗体
        //创建按钮
        javaButton = new JButton("搜索");
        javaButton.setBounds(110, 50, 100, 30);
        con.add(javaButton);    //将按钮添加到窗体

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗体时，退出程序
        this.setVisible(true);    //显示窗体
    }
}
