package com.pro07;

import java.io.FileWriter;
import java.io.IOException;

public class Pro03 {

    public static void main(String[] args) {
        //用FileWriter向文件写入字符流数据
        try {
            FileWriter fw = new FileWriter("D:\\Study\\Test\\03.txt");
            fw.write("Hello World!");
            fw.write("世界，你好！123423");
            fw.close();
            System.out.println("写入成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
