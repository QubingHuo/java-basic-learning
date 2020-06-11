package com.imp.deadlock;

/**
 * 定义两个对象，用于上锁
 **/
public class MyLock {
    //设置为静态的，方便使用的时候不需要再new MyLock()
    static Object obj1 = new Object();
    static Object obj2 = new Object();
}