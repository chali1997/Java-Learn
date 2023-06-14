package com.pro11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Thread01 extends JFrame implements ActionListener {
    //成员变量
    private JLabel javaLabel1, javaLabel2;        //标签，显示不可编辑的文字
    private JButton javaButton1, javaButton2;    //按钮

    //构造函数，一般在构造函数中设置好窗口属性，创建对象时就会生成一个窗口
    public Thread01(String title) {
        super(title);    //窗体标题
        this.setBounds(0, 0, 300, 200);    //窗体左上角坐标，宽高

        //获取内容面板对象，用于管理窗体中的控件
        Container con = this.getContentPane();
        con.setLayout(null);

        //添加标签
        javaLabel1 = new JLabel("0");
        javaLabel1.setBounds(20, 30, 100, 30);
        con.add(javaLabel1);
        javaLabel2 = new JLabel("Hello World");
        javaLabel2.setBounds(20, 75, 100, 30);
        con.add(javaLabel2);

        //添加按钮
        javaButton1 = new JButton("开始计数");
        javaButton1.setBounds(130, 30, 100, 30);    //设置坐标和宽高
        con.add(javaButton1);    //添加到面板中
        javaButton1.addActionListener(this);
        javaButton2 = new JButton("修改文字");
        javaButton2.setBounds(130, 75, 100, 30);    //设置坐标和宽高
        con.add(javaButton2);    //添加到面板中
        javaButton2.addActionListener(this);

        //设置默认关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);    //设置窗口可见
    }

    //主方法
    public static void main(String[] args) {
        //创建一个窗口对象，就会显示一个窗体
        Thread01 login = new Thread01("多线程案例");
    }

    //按钮单击事件的处理方法
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //JOptionPane.showMessageDialog(this, "你好");	//弹出消息
        JButton javaButton = (JButton) arg0.getSource();    //获取被点击的按钮
        if (javaButton == javaButton1)        //点击的是"开始计数"按钮
        {
            //从这里开始写点击按钮后执行的代码，让javaLabel1上的数字从1变化到10，每次间隔1秒
            new Thread(new Runnable() {
                @Override
                public void run() {    //将耗时10秒的代码，放在子线程中执行
                    for (int i = 1; i <= 10; i++) {
                        //一般情况下，不能用子线程操作主线程中的定义的控件。
                        javaLabel1.setText(i + "");
                        try {
                            Thread.sleep(1000);    //让线程休眠1秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        } else if (javaButton == javaButton2)        //点击的是"修改文字"按钮
        {
            //从这里开始写点击按钮后执行的代码，让javaLabel2上的文字变为"世界，你好！"
            javaLabel2.setText("世界，你好！");


        }
    }
}