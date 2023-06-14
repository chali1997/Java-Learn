package com.pro12;

import javax.swing.*;
import java.awt.*;

public class BorderLayout01 extends JFrame {
    public BorderLayout01() {
        this.setBounds(0, 0, 400, 300);    //窗体的起点和大小
        Container con = this.getContentPane();    //得到内容面板
        con.setLayout(new BorderLayout());

        JButton javaButton1 = new JButton("按钮0");
        con.add(javaButton1, BorderLayout.NORTH);    //添加到内容面板
        con.add(new JButton("按钮1"), BorderLayout.SOUTH);
        con.add(new JButton("按钮2"), BorderLayout.WEST);
        con.add(new JButton("按钮3"), BorderLayout.EAST);
        con.add(new JButton("按钮4"), BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayout01 borderLayout01 = new BorderLayout01();

    }

}
