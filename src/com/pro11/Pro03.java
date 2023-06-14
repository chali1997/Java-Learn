package com.pro11;

public class Pro03 {
    public static void main(String[] args) {
        //不创建Thread的子类，启动子线程
        //new Thread().start();	//Thread th=new Thread(); th.start();
        //在创建Thread对象时，改写它的run()方法
        new Thread() {
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
        }.start();

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
