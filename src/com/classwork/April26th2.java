package com.classwork;

import java.io.File;
import java.util.Scanner;

public class April26th2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        /*Use the Scanner object to get the path of some folder entered by the user,
        and then use the File object to output the full path of all subfolders and
        subfiles in the next level of that folder.*/
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("文件夹：" + f.getAbsolutePath());
                } else if (f.isFile()) {
                    System.out.println("文件：" + f.getAbsolutePath());
                } else {
                    System.out.println("错误路径");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
