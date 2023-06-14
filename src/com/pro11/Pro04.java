package com.pro11;

public class Pro04 {
    public static void main(String[] args) {
        //创建一个Runnable接口的匿名子类对象，启动线程
        //new Thread(new Runnable(){}).start();
        new Thread(new Runnable() {    //定义一个Runnable接口的匿名子类，并重写run()方法
            @Override
            public void run() {
                for (int i = 97; i <= 107; i++) {
                    System.out.println((char) i);    //输出对应的字符
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
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
