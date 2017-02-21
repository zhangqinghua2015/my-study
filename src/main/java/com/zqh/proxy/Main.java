package com.zqh.proxy;

import com.zqh.proxy.cglib.MyMethodInterceptor;
import com.zqh.proxy.jdk.ProxyHandler;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class Main {

    public static void main(String[] args) {
        OriginalImpl oimpl = new OriginalImpl();
        ProxyHandler ph = new ProxyHandler(oimpl);
        Original o = (Original) ph.getProxy();
        System.out.println(o.say("haha"));

        MyMethodInterceptor mmi = new MyMethodInterceptor();
        Enhancer e = new Enhancer();
        e.setSuperclass(OriginalImpl.class);
        e.setCallback(mmi);

        OriginalImpl oi = (OriginalImpl) e.create();
        System.out.println(oi.say("bibi"));
    }

}
