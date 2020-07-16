package com.wesley.pattern.singleton;

/**
 * 推荐使用
 * 属于 饿汉模式
 * @author Wesley Created By 2018/8/4
 */
public class EnumSingleton {

    private EnumSingleton(){

    }

    /**
     * 可防止反射 破坏 单例
     * 枚举对象不能通过反射创建
     */
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
