package com.zqh.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(null);
        l.add(null);
        l.add(null);
        System.out.println(l.size());
        // remove object 时，只会移除最先匹配到的元素
        l.remove(null);
        System.out.println(l.size());
        Iterator a = l.iterator();
        while(a.hasNext()) {
            System.out.println(a.next());
        }

        LinkedList b = new LinkedList();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);

        for (Object n : b) {
            b.remove(n);
        }
//        Iterator i = b.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//            i.remove();
//        }
        for (Object n : b) {
            System.out.println(n);
        }
    }


}
