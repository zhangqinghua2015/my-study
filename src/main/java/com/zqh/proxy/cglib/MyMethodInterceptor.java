package com.zqh.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class MyMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object result;
        if ("say".equals(method.getName())) {
            System.out.println("cglib before you say");
            result = methodProxy.invokeSuper(o, objects);
            System.out.println("cglib after you say");
        } else {
            result = methodProxy.invokeSuper(o, objects);
        }
        return result;
    }
}
