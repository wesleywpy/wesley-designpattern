package com.wesley.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.MemoryHandler;

import static java.lang.reflect.Proxy.*;

/**
 * @author Created by Wesley on 2016/4/29.
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    public DynamicProxy(Object source) {
        this.source = source;
    }

    /**
     * @param proxy 代理对象
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName() + ","+ method.getName());
//        return null;
        //这里如果source是TestClass，但是我们不能使用反射,来调用它的方法，因为代理的是TestInterface接口，像下面这样，放开这一行会抛异常
        return method.invoke(source, args);

        //如果要继续使用TestClass，只要你确认你传入的类中的方法, 包括了所有你传入的接口的方法，只是没实现这些接口而已，那么你可以在invoke中这样使用。
//        Method sourceMethod = source.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
//        return sourceMethod.invoke(source, args);
    }

    public static void main(String[] args){
        TestInterface testInterface = (TestInterface)Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{TestInterface.class},
                new DynamicProxy(new TestClass()));
        testInterface.method1();
        testInterface.method2();
        testInterface.method3();
    }
}
