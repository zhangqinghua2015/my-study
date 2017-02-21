package com.zqh.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OrangeKiller on 2017/2/13.
 */
public class MySubject implements Subject{

    private List<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notify(Object message) {
        for (Observer observer: observerList) {
            observer.update(message);
        }
    }

    public static void main(String[] args) {
        Observer ob1 = new MyObserver("ob1");
        Observer ob2 = new MyObserver("ob2");
        Observer ob3 = new MyObserver("ob3");

        Subject sj = new MySubject();
        sj.attach(ob1);
        sj.attach(ob2);
        sj.attach(ob3);

        sj.notify("收到新通知");
    }
}
