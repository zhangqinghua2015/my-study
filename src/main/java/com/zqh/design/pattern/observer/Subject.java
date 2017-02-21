package com.zqh.design.pattern.observer;

/**
 * Created by OrangeKiller on 2017/2/13.
 */
public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notify(Object message);

}
