package com.zqh.design.pattern.observer;

/**
 * Created by OrangeKiller on 2017/2/13.
 */
public class MyObserver implements Observer{

    private String name;

    public MyObserver() {}

    public MyObserver(String name) {
        this.name = name;
    }


    public void update(Object message) {
        System.out.println(name + "--" + message);
    }
}
