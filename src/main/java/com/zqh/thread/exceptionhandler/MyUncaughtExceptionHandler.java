package com.zqh.thread.exceptionhandler;

import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA_2_3.portable.OutputStream;

/**
 * Created by OrangeKiller on 2017/2/6.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Exception in Thread " + t.getName());
        System.out.println("Exception is " + e);
        System.out.println("Exception is " + e.getMessage());
    }

}
