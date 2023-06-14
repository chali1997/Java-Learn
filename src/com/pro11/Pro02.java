package com.pro11;

public class Pro02 {
    public static void main(String[] args) {
        //启动子线程
        PrimeThread2 pt2 = new PrimeThread2();
        Thread th = new Thread(pt2);
        th.start();
        //new Thread(new PrimeThread2()).start();
        //主方法main()所在的线程，叫主线程
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);    //让当前线程休眠0.5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//创建Runnable接口的子类
class PrimeThread2 implements Runnable {
    @Override
    public void run() {    //启动线程后执行的代码
        for (int i = 97; i <= 107; i++) {
            System.out.println((char) i);    //输出对应的字符
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
