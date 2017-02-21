package com.zqh.thread.getreturn;

import java.util.concurrent.*;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class ThreadReturnTest {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        long begin = System.currentTimeMillis();
        Future<String> f = es.submit(new Callable<String>() {
            public String call() throws Exception {
                Thread.sleep(10000);
                int i = 1/0;
                return "return value";
            }
        });
        // shutdown方法不会阻塞
        es.shutdown();
        //es.submit(new Thread()); shudtown之后再调用submit会抛RejectedExecutionException异常
        System.out.println("Submit spend time " + (System.currentTimeMillis() - begin));
        try {
            System.out.println(f.get());
            System.out.println("Get return value spend time" + (System.currentTimeMillis() - begin));
        } catch (InterruptedException e) {
            System.out.println("InterruptedException----->");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("ExecutionException----->");
            e.printStackTrace();
        }
    }

}
