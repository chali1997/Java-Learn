package com.pro12;

import javax.swing.*;
import java.awt.*;

public class Pro01 {
    public static void main(String[] args) {
        //创建一个界面/窗体
        JFrame javaFrame = new JFrame();
        //左顶点坐标(100,150)，长300，宽200
        javaFrame.setBounds(100, 150, 300, 200);

        //-----放入文本框和按钮----------
        //得到javaFrame窗体的内容面板
        Container con = javaFrame.getContentPane();
        //将内容面板的布局模式设为null，即按坐标和大小来排列
        con.setLayout(null);    //带入的参数不一样，排列的规则就不一样
        //创建文本框
        JTextField javaTextField = new JTextField("Hello");
        javaTextField.setBounds(10, 50, 100, 30);    //(0,50)是相对于javaFrame内容面板的左上角来定位的
        con.add(javaTextField);    //将文本框添加到窗体
        //创建按钮
        JButton javaButton = new JButton("搜索");
        javaButton.setBounds(110, 50, 100, 30);
        con.add(javaButton);    //将按钮添加到窗体

        //设置默认的关闭操作
        javaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        javaFrame.setVisible(true);
    }
}
