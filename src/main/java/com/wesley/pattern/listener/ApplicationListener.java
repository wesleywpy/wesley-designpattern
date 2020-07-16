package com.wesley.pattern.listener;

/**
 * <p>
 *  应用事件监听器
 * </p>
 *
 * @author Created by Yani on 2020/07/16
 */
public interface ApplicationListener<E extends ApplicationEvent>{

    /**
     * 处理事件
     * @param event 事件类型
     */
    void onApplicationEvent(E event);
}
