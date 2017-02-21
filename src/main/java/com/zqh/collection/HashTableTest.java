package com.zqh.collection;

import java.util.*;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class HashTableTest {

    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put("key1", 1);
        Enumeration e = h.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        Enumeration ke = h.keys();
        while(ke.hasMoreElements()) {
            Object key = ke.nextElement();
            System.out.println(key);
            System.out.println(h.get(key));
        }
        Set keys = h.keySet();
        Iterator keysi = keys.iterator();
        while(keysi.hasNext()) {
            Object key = keysi.next();
            System.out.println(key);
            System.out.println(h.get(key));
        }
        Set entrys = h.entrySet();
        Iterator entrysi = entrys.iterator();
        while(entrysi.hasNext()) {
            Map.Entry metr = (Map.Entry) entrysi.next();
            System.out.println(metr.getKey());
            System.out.println(metr.getValue());
        }
        Collection v = h.values();
        Iterator vi = v.iterator();
        while(vi.hasNext()) {
            System.out.println(vi.next());
        }
    }

}
