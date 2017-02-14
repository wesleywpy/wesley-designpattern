package com.wesley.pattern.singleton;

/**
 * @author Created by Wesley on 2016/4/28.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    public static SynchronizedSingleton getInstance(){
        if (null == instance) {
            synchronized (SynchronizedSingleton.class) {
                if(null == instance){
                    return  new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
