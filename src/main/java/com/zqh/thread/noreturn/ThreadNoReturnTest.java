package com.zqh.thread.noreturn;

import java.util.concurrent.*;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class ThreadNoReturnTest {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        long begin = System.currentTimeMillis();
        for (int i=0; i<2; i++)
            try {
                es.execute(new Runnable() {
                    public void run() {
//                        try {
//                            Thread.sleep(10000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
                        int i = 1 / 0;
                    }
                });
            } catch(Exception e) {
                System.out.println("Exception--->" + e);
            }
        es.shutdown();
    }

}
