package com.pro07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pro01 {
    public static void main(String[] args) {
        //向文件中追加写入文字
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("D:\\Study\\Test\\02.txt", true);
            fos.write(97);            //97是a的ASCII码

            char ch = 'b';
            fos.write((int) ch);        //写入字母b

            String s = "世界，你好!";
            byte[] bt = s.getBytes();    //将字符串先转换成字节数组
            fos.write(bt);            //写入字节数组

            fos.close();            //关闭文件
            System.out.println("写入成功！");
        }
		/*
		catch(Exception ex)	//Exception是所有异常类的父类，它可以捕获所有异常
		{
			System.out.println(ex.getMessage());
		}
		*/ catch (FileNotFoundException ex1) {
            System.out.println(ex1.getMessage());    //输出异常信息
        } catch (IOException ex2) {
            System.out.println(ex2.getMessage());    //输出异常信息
        }
    }
}
