package com.pro07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pro04 {

    public static void main(String[] args) {
        //用有缓冲功能的对象，读取字符流
        FileReader fr;
        try {
            fr = new FileReader("D:\\Study\\Test\\03.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();    //读取一段
            while (s != null) {
                System.out.println(s);
                s = br.readLine();    //读取下一行
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
