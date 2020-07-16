package com.wesley.pattern.listener;

/**
 * <p>
 *  监听器实现
 * </p>
 *
 * @author Created by Yani on 2020/07/16
 */
public class ContextRefreshListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(" -----> ContextRefreshListener 处理 ContextRefreshedEvent ...");
    }

}
