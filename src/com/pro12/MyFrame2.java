package com.pro12;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.*;

//定义一个JFrame的子类，它也是一个窗体/界面
public class MyFrame2 extends JFrame {
    //字段，成员变量——这里一般放窗体中的控件，如按钮、文本框
    private JTextField javaTextField;    //文本框
    private JButton javaButton;    //按钮
    private JLabel javaLabel;

    //构造函数/方法——一般用来初始化窗体/界面
    public MyFrame2() {
        //左顶点坐标(50,250)，长400，宽300
        this.setBounds(50, 250, 400, 300);    //调用从JFrame中继承的方法,this指当前对象
        Container con = this.getContentPane();    //得到内容面板
        con.setLayout(null);    //设置布局方式，这里是按坐标、长宽来排列

        javaLabel = new JLabel("00");
        javaLabel.setBounds(10, 10, 100, 30);
        javaLabel.setBackground(Color.WHITE);
        con.add(javaLabel);

        javaTextField = new JTextField();
        javaTextField.setBounds(10, 50, 100, 30);    //(10,50)是相对于窗体的内容面板的左上角来定位的
        con.add(javaTextField);    //将文本框添加到窗体
        Document doc = javaTextField.getDocument();
        doc.addDocumentListener(new DocumentListener() {
                                    @Override
                                    public void insertUpdate(DocumentEvent e) {
                                        javaLabel.setText(javaTextField.getText());
                                    }

                                    @Override
                                    public void removeUpdate(DocumentEvent e) {
                                    }

                                    @Override
                                    public void changedUpdate(DocumentEvent e) {
                                    }
                                }
        );

        //创建按钮
        javaButton = new JButton("搜索");
        javaButton.setBounds(110, 50, 100, 30);
        con.add(javaButton);    //将按钮添加到窗体
        //按钮单击事件

        //javaButton.addActionListener(ActionListener接口的子类对象);
        //将javaButton的单击动作，与AL01对象的actionPerformed()方法绑定
        javaButton.addActionListener(new AL01());
        //javaButton.addMouseListener(new ML01()); //添加鼠标监听
        javaButton.addMouseMotionListener(new MouseMotionListener() {
                                              @Override
                                              public void mouseDragged(MouseEvent e) {
                                                  int x = e.getX();
                                                  int y = e.getY();
                                                  javaButton.setLocation(x, y);    //把按钮的坐标设置成鼠标的位置
                                              }

                                              @Override
                                              public void mouseMoved(MouseEvent e) {
                                              }
                                          }
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗体时，退出程序
        this.setVisible(true);    //显示窗体
    }

    public static void main(String[] args) {
        MyFrame2 myFrame2 = new MyFrame2();
    }
}

class AL01 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //单击按钮时，会执行下面的代码
        //System.out.println("你点击按钮!");
        JOptionPane.showMessageDialog(null, "点击了按钮");
    }
}

class ML01 implements MouseListener {
    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "鼠标进入了");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }

}