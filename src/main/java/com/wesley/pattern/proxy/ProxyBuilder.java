package com.wesley.pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author Created by Wesley on 2016/7/1.
 */
public class ProxyBuilder {

    /**
     * JDK动态代理一个对象
     * @param source 源对象
     * @return
     */
    public static Object createJDKProxyObject(Object source){
        Objects.requireNonNull(source);
        Objects.requireNonNull(source.getClass().getInterfaces());
        return Proxy.newProxyInstance(source.getClass().getClassLoader(), source.getClass().getInterfaces(), new JDKDynamicProxy(source));
    }

    public static Object createCglibProxyObject(Object source){
        Objects.requireNonNull(source);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(source.getClass());
        enhancer.setCallback(new CglibDynamicProxy());
        return enhancer.create();
    }

    private static class CglibDynamicProxy implements MethodInterceptor{

        /**
         * @param o 目标类
         * @param method 目标类方法反射对象
         * @param objects
         * @param methodProxy 代理类实例
         * @return
         * @throws Throwable
         */
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            return methodProxy.invokeSuper(o, objects);
        }
    }

}
