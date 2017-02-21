package com.zqh.proxy;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class OriginalImpl implements Original{

    public String say(String info) {
        System.out.println("you say: " + info);
        return "ok";
    }

}
