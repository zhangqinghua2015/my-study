package com.zqh.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList init = new ArrayList(20);
        System.out.println(init.size());

        // remove object 时，只会移除最先匹配到的元素
        ArrayList a = new ArrayList();
        a.add(null);
        a.remove(null);

        // for循环删除List元素
        ArrayList b = new ArrayList();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);

        // 会抛ConcurrentModificationException异常，foreach会拿到一个Iterator对象，直接调用List的remove方法不会
        // 更新这个Iterator对象里的expectedModCount，只会更新List的ModCount；当继续遍历时，Iterator会比较expectedModCount
        // 与ModCount是否相等，不相等则证明List已经被修改过了，则抛出ConcurrentModificationException
//        for (Object n : b) {
//            b.remove(n);
//        }
        Iterator i = b.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            i.remove();
        }
        for (Object n : b) {
            System.out.println(n);
        }
    }

}
