package com.company.单例模式.多线程下的单例模式;

public class SingletonWithEagerly {

    private static SingletonWithEagerly uniqueInstance=new SingletonWithEagerly();

    private SingletonWithEagerly(){}

    public static SingletonWithEagerly getUniqueInstance() {
        return uniqueInstance;
    }
}
