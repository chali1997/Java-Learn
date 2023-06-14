package com.pro12;

import javax.swing.*;
import java.awt.*;

public class FlowLayout01 extends JFrame {
    //构造函数，初始化窗体
    public FlowLayout01() {
        this.setBounds(0, 0, 400, 300);    //窗体的起点和大小
        Container con = this.getContentPane();    //得到内容面板
        //FlowLayout fl=new FlowLayout();	//创建布局对象
        //con.setLayout(fl); 	//设置布局
        con.setLayout(new FlowLayout());

        JButton javaButton1 = new JButton("按钮0");
        con.add(javaButton1);    //添加到内容面板
        con.add(new JButton("按钮1"));
        con.add(new JButton("按钮2"));
        con.add(new JButton("按钮3"));
        con.add(new JButton("按钮4"));
        con.add(new JButton("按钮5"));
        con.add(new JButton("按钮6"));
        con.add(new JButton("按钮7"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //创建FlowLayout01的对象，调用构造函数就能得到一个窗体
        FlowLayout01 flowLayout01 = new FlowLayout01();
    }

}
