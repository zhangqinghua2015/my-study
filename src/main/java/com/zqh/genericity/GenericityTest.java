package com.zqh.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OrangeKiller on 2017/2/13.
 */
public class GenericityTest {

    public static void main(String[] args) {
        // extends 可以接受任何子类，可以get，不可以add
        List<? extends Number> list1 = new ArrayList<Integer>();
        list1.get(0);

        // super 可以接受任何父类，可以add，不能get
        List<? super Number> list2 = new ArrayList<Object>();
        list2.add(2.0);
        list2.add(1);
        Object a = list2.get(1);
    }

}
