package com.wesley.pattern.listener;

/**
 * <p>
 *  应用事件
 * </p>
 *
 * @author Created by Yani on 2020/07/16
 */
public abstract class ApplicationEvent {

    /**
     * 事件发生的系统时间
     */
    private long timestamp;

    public ApplicationEvent() {
        this.timestamp = System.currentTimeMillis();
    }

}
