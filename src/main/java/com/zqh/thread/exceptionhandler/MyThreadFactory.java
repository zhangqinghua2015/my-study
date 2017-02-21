package com.zqh.thread.exceptionhandler;

import java.util.concurrent.ThreadFactory;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class MyThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        System.out.println("create thread: " + t.getName());
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("set thread exception handler: " + t.getUncaughtExceptionHandler());
        return t;
    }

    public static void main(String[] args) {
        Thread t = new MyThreadFactory().newThread(new Runnable() {

            public void run() {
                System.out.println("run start");
                int i = 1/0;
            }
        });

        t.start();
    }
}
