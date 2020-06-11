package com.imp.deadlock;

/**
 * 运行时程序无法结束，控制台暂停打印
 * 分析最后几行内容，会发现死锁
 */
public class MainTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(true));
        Thread t2 = new Thread(new Task(false));
        t1.start();
        t2.start();
    }
}