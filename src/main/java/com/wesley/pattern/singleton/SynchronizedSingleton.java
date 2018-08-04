package com.wesley.pattern.singleton;

/**
 * 双重检测单例模式
 * @author Created by Wesley on 2016/4/28.
 */
public class SynchronizedSingleton {

    private volatile static SynchronizedSingleton instance = null;

    private SynchronizedSingleton(){}

    /**
     * 正常顺序
     * 1. 分配对象的内存空间
     * 2. 初始化对象
     * 3. 设置instance指向刚分配的内存空间
     *
     * JVM和CPU优化, 发生指令重排序 使用 volatile 关键字禁止重排序
     *
     * 1. 分配对象的内存空间
     * 3. 设置instance指向刚分配的内存空间
     * 2. 初始化对象
     */
    public static SynchronizedSingleton getInstance(){
        // 如果发生重排序, 线程会获取到 没有初始化的对象实例
        if (null == instance) { // 双重检测机制
            synchronized (SynchronizedSingleton.class) { // 同步锁
                if(null == instance){
                    return  new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
