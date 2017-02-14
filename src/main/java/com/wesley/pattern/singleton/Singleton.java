package com.wesley.pattern.singleton;

/**
 * @author Created by Wesley on 2016/4/28.
 */
public class Singleton {

    private Singleton(){}

    public static Singleton getInstancer(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{
        static Singleton instance = new Singleton();
    }
}
