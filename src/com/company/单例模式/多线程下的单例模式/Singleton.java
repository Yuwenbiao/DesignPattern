package com.company.单例模式.多线程下的单例模式;

/** 如果getInstance的性能对应用程序不是关键，就什么也不要做*/
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
