package com.pro07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Pro02 {
    public static void main(String[] args) {
        //用FileInputStream读取文件内容，并输出
        FileInputStream fis;        //Ctrl+Shift+O，就可以导入所有类的包
        try {
            fis = new FileInputStream("D:\\Study\\Test\\01.txt");
			/* //读取1个字节
			int x=fis.read();		//读取1个字节，返回int类型
			char ch=(char)x;		//将整数转换成字符
			System.out.println(ch); 
			*/
			/* //循环读取文件中所有内容
			int y=fis.read();		//读取1个字节
			while(y!=-1)		//返回-1代表文件末尾。没有读取到文件末尾，就继续循环读取
			{
				System.out.print((char)y);	//将y转换成字符，再输出
				y=fis.read();		//读取下一个
			}
			*/
            //一次性读取所有内容
            int num = fis.available();        //能读取的内容的字节数
            byte[] bt = new byte[num];
            fis.read(bt);        //将文件内容读取到数组bt中
            String s = new String(bt);    //用系统默认的编码，将byte[]字节数组转换成字符串
            //String s2=new String(bt, "编码集的名字");	//使用指定的编码，将字节数组转换成字符串
            System.out.println(s);
            fis.close();        //关闭文件
        } catch (FileNotFoundException e) {
            e.printStackTrace();    //打印异常
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
