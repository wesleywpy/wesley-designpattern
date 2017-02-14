package com.wesley.pattern.observer;

/**
 * 观察者设计模式 - 主题接口
 * @author Created by Wesley on 2017/2/13.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
