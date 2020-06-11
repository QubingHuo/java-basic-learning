package com.imp.deadlock;

public class Task implements Runnable {

    boolean flag;

    public Task(boolean flag) {
        this.flag = flag;
    }

    //while (true) 的目的是让死锁一定发生，不然运行时经常会遇到恰好正常执行的状态，没法出现死锁状态
    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (MyLock.obj1) {
                    System.out.println("true, get obj1");
                    synchronized (MyLock.obj2) {
                        System.out.println("true, get obj2");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (MyLock.obj2) {
                    System.out.println("false, get obj2");
                    synchronized (MyLock.obj1) {
                        System.out.println("false, get obj1");
                    }
                }
            }
        }
    }
}