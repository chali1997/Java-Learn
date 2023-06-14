package com.pro07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Temp {
    public static void main(String[] args) {
        FileInputStream ins;
        try {
            ins = new FileInputStream("D:\\Study\\Test\\01.txt");
            int num = ins.available();  //能读取的内容的字节数
            byte[] bt = new byte[num];
            ins.read(bt); //将文件内容读取到数组bt中
            String s = new String(bt);  //用系统默认的编码，将byte[]数组转换为字符串
            System.out.println(s);
            ins.close();  //关闭文件
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
