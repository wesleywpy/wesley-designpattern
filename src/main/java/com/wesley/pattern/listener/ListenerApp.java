package com.wesley.pattern.listener;

/**
 * <p>
 *
 * </p>
 *
 * @author Created by Yani on 2020/07/16
 */
public class ListenerApp {

    public static void main(String[] args) {
        EventMulticaster multicaster = new EventMulticaster();
        ContextRefreshListener contextRefreshListener = new ContextRefreshListener();
        multicaster.addApplicationListener(contextRefreshListener);
        multicaster.multicastEvent(new ContextRefreshedEvent());
    }
}
