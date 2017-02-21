package com.zqh.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(null, null);

        final HashMap hm = new HashMap();
        hm.put(0,0);
        Thread r1 = new Thread(new Runnable() {
            public void run() {
                for (int i=1; i<1000; i++) {
                    hm.put(i,i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("put : " + i);
                }
            }
        });

        Thread r2 = new Thread(new Runnable() {
            public void run() {
                Set es = hm.entrySet();
                Iterator it = es.iterator();
                while(it.hasNext()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("get : " + it.next());
                }
//                for (int i=0; i<1000; i++) {
//                    System.out.println("get : " + hm.get(i));
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
        });

        r1.start();
        r2.start();
    }

}
