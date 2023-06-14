package com.pro11;

public class Pro06 {
    private static int x = 1;

    public static void main(String[] args) {
        //线程的join()方法
        //创建子线程，并重写run()方法
        Thread th = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 2000000000; i++) {
                    x++;
                }
            }
        };
        th.start();

        try {
            th.join(3);    //等待th执行完毕或者执行指定的3毫秒后，才会把CPU让给其他线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //主线程
        System.out.println("x=" + x);
    }
}
