package com.pro12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drawing extends JFrame {
    //成员变量，一般定义控件
    private JLabel javaLabel;        //标签
    private JButton javaButton, javaButton2;    //按钮

    //构造函数，用于对窗体初始化
    public Drawing() {
        this.setBounds(300, 100, 450, 500);    //坐标，宽高
        Container con = this.getContentPane();    //得到内容面板
        con.setLayout(null);    //设置布局方式为null，即根据坐标和大小来定位

        javaLabel = new JLabel();
        javaLabel.setBounds(0, 0, 300, 500);
        javaLabel.setBackground(Color.BLACK);
        javaLabel.setOpaque(true);
        con.add(javaLabel);    //添加到内容面板

        javaButton = new JButton("画图");
        javaButton.setBounds(310, 100, 80, 30);
        con.add(javaButton);
        //javaButton.addActionListener(ActionListener接口的子类对象);
        javaButton.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {
                                             Graphics graphics = javaLabel.getGraphics();    //得到画图对象
                                             graphics.setColor(Color.YELLOW);
                                             graphics.drawRect(10, 10, 100, 80);    //画边框
                                             graphics.fillRect(10, 150, 100, 30);    //填充矩形

                                         }
                                     }
        );

        javaButton2 = new JButton("下落");
        javaButton2.setBounds(310, 150, 80, 30);
        con.add(javaButton2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
    }
}


