package com.classwork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class April26th {
    public static void main(String[] args) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("D:\\t01.txt");
            Scanner input = new Scanner(System.in);
            String x = input.nextLine();
            byte[] bt = x.getBytes();
            fos.write(bt);
            fos.close();
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
