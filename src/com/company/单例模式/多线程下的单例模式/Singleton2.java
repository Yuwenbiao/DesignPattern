package com.company.单例模式.多线程下的单例模式;

/**
 * 利用“双重检查加锁”，在getInstance中减少使用同步
 */
public class Singleton2 {

    private volatile static Singleton2 unniqueInstance;

    public static Singleton2 getInstance() {
        if (unniqueInstance == null) {
            synchronized (Singleton2.class) {
                if (unniqueInstance == null) {
                    unniqueInstance = new Singleton2();
                }
            }
        }
        return unniqueInstance;
    }

    private Singleton2() {
    }
}
