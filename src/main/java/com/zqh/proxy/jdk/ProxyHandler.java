package com.zqh.proxy.jdk;

import com.zqh.proxy.Original;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class ProxyHandler implements InvocationHandler {

    Object target;

    public ProxyHandler() {
    }

    public ProxyHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if ("say".equals(method.getName())) {
            System.out.println("before you say");
            result = method.invoke(target, args);
            System.out.println("after you say");
        } else {
            result = method.invoke(proxy, args);
        }
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

}
