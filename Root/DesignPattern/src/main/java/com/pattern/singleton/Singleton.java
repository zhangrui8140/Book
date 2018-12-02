package com.pattern.singleton;

public class Singleton {
    public static Singleton singletonInstance=null;

    public Singleton () {
    }

    /**
     * 基础获取单例
     * 线程不安全
     * @return
     */
    public static Singleton getSingletonInstance() {
        if(singletonInstance==null){
            singletonInstance=new Singleton();
        }
        return singletonInstance;
    }

    /**
     * 线程安全
     * 性能上会有所下降，因为每次调用getInstance()，都要对对象上锁
     * @return
     */
    public static synchronized Singleton getSingletonInstanceWithSynchronized() {
        if(singletonInstance==null){
            singletonInstance=new Singleton();
        }
        return singletonInstance;
    }


    /**
     * 多线程下提升性能
     * 但是还是因为JVM可能只分配内存 没有创建实例 有问题
     * @return
     */
    public static Singleton getSingletonInstanceWithSynchronizedOnlyOnce() {
        if(singletonInstance==null){
            synchronized (singletonInstance){
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

    /**
     * 单例模式使用内部类来维护单例的实现，
     * JVM内部的机制能够保证当一个类被加载的时候，
     * 这个类的加载过程是线程互斥的
     */
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }


    public Object readResolve(){
        return singletonInstance;
    }
}
