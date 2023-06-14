package com.pro12;

import javax.swing.*;
import java.awt.*;

public class GridLayout2 extends JFrame {
    public GridLayout2() {
        this.setBounds(0, 0, 400, 300);    //窗体的起点和大小
        Container con = this.getContentPane();    //得到内容面板
        con.setLayout(new GridLayout(3, 2));

        JButton javaButton1 = new JButton("按钮0");
        con.add(javaButton1);    //添加到内容面板
        con.add(new JButton("按钮1"));
        con.add(new JButton("按钮2"));
        con.add(new JButton("按钮3"));
        con.add(new JButton("按钮4"));
        con.add(new JButton("按钮5"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GridLayout2 gridLayout2 = new GridLayout2();
    }
}
