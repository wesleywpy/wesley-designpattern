package com.wesley.pattern.singleton;

/**
 * 推荐使用
 * @author Wesley Created By 2018/8/4
 */
public class EnumSingleton {

    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getSingleton();
    }

    private enum Singleton{
        INSTANCE;

        private EnumSingleton singleton;

        // JVM保证构造只会调用一次
        Singleton(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getSingleton() {
            return singleton;
        }
    }
}
