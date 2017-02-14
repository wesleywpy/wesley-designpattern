package com.wesley.pattern.observer;

import java.util.List;

/**
 * 观察者实现
 * @author Created by Wesley on 2017/2/13.
 */
public abstract class Customer implements Observer {

    @Override
    public void update(String params) {
        decryption(params);
        System.out.println("hehe");
    }

    abstract List<BathingPlace.technician> decryption(String params);

}
