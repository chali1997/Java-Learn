package com.pro12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drawing2 extends JFrame {
    //成员变量，一般定义控件
    private JLabel javaLabel;        //标签
    private JButton javaButton, javaButton2, javaButton3;    //按钮
    private int x = 80, y = 20, width = 100, height = 25;    //坐标和宽高

    //构造函数，用于对窗体初始化
    public Drawing2() {
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
                                             //graphics.drawRect(10, 10, 100, 80);	//画边框
                                             //graphics.fillRect(10, 150, 100, 30);	//填充矩形
                                             graphics.fillRect(x, y, width, height);
                                         }
                                     }
        );

        javaButton2 = new JButton("下落");
        javaButton2.setBounds(310, 150, 80, 30);
        con.add(javaButton2);
        javaButton2.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              //实现方块下落，即先擦除，再在下方画方块
                                              Graphics graphics = javaLabel.getGraphics();    //得到画图对象
                                              //用背景色画图，即擦除
                                              graphics.setColor(Color.BLACK);
                                              graphics.fillRect(x, y, width, height);
                                              y = y + 25;    //下落
                                              graphics.setColor(Color.YELLOW);
                                              graphics.fillRect(x, y, width, height);
                                          }
                                      }
        );
        javaButton3 = new JButton("连续下落");
        javaButton3.setBounds(310, 190, 100, 30);
        con.add(javaButton3);
        javaButton3.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              //实现方块下落，即先擦除，再在下方画方块
                                              Graphics graphics = javaLabel.getGraphics();    //得到画图对象
                                              new Thread(new Runnable() {
                                                  @Override
                                                  public void run() {
                                                      for (int i = 0; i < 10; i++) {
                                                          //用背景色画图，即擦除
                                                          graphics.setColor(Color.BLACK);
                                                          graphics.fillRect(x, y, width, height);
                                                          y = y + 25;    //下落
                                                          graphics.setColor(Color.YELLOW);
                                                          graphics.fillRect(x, y, width, height);
                                                          try {
                                                              Thread.sleep(1000);
                                                          } catch (InterruptedException e1) {
                                                              e1.printStackTrace();
                                                          }
                                                      }
                                                  }
                                              }
                                              ).start();
                                          }
                                      }
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Drawing2 drawing2 = new Drawing2();
    }
}


