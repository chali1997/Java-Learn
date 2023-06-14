package com.pro11;

public class Pro05 {
    private static int x = 100;    //定义全局变量

    //定义一个synchronized修饰的方法，该方法在某一时刻只能被一个线程使用
    public synchronized static void sub() {
        x = x - 1;
        System.out.println(Thread.currentThread().getName()
                + "线程中减1后, x=" + x);
    }

    public static void main(String[] args) {
        //static方法中可以直接使用static变量/方法，或者使用"对象.普通变量/方法"
        //在子线程中，循环30次，让x每次减1，然后休眠0.01秒
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    //x=x-1;
                    //System.out.println("子线程中减1后, x=" + x);
                    sub();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        //在主线程中，循环30次，让x每次减1，然后休眠0.01秒
        for (int i = 0; i < 30; i++) {
            //x=x-1;
            //System.out.println("主线程中减1后, x=" + x);
            sub();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
