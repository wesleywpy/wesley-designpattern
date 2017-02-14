package com.wesley.pattern.state;

/**
 * Context
 * Created by Wesley on 2016/5/3.
 */
public class Person {

    private PersonState workingState = new WorkState();

    public void work(){
        workingState.doIt();
    }

    public static void main(String[] args){
        new Person().work();
    }
}
