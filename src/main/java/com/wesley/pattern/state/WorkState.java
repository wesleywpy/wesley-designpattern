package com.wesley.pattern.state;

/**
 * 具体的状态
 * Created by Wesley on 2016/5/3.
 */
public class WorkState extends PersonState {

    @Override
    public void doIt() {
        System.out.print("I'm working...");
    }
}
