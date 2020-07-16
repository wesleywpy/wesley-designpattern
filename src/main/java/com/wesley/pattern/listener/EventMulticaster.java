package com.wesley.pattern.listener;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  事件广播器
 * </p>
 *
 * @author Created by Yani on 2020/07/16
 */
public class EventMulticaster {

    public final Set<ApplicationListener<?>> applicationListeners = new LinkedHashSet<>();


    public void addApplicationListener(ApplicationListener<?> listener){
        applicationListeners.add(listener);
    }
    /**
     * 广播具体时间
     * @param event
     */
    public void multicastEvent(ApplicationEvent event) {
        List<ApplicationListener<?>> applicationListeners = getApplicationListeners(event, event.getClass().getSimpleName());
        for (ApplicationListener<?> listener : applicationListeners) {
            doInvokeListener(listener, event);
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void doInvokeListener(ApplicationListener listener, ApplicationEvent event) {
        try {
            listener.onApplicationEvent(event);
        } catch (ClassCastException ex) {

        }
    }

    /**
     *
     * @param event 事件对象
     * @param type 具体的事件类型
     * @return
     */
    private List<ApplicationListener<?>> getApplicationListeners(ApplicationEvent event, String type) {
        /**
         * 根据事件类型找到对应的监听器
         */
        return new ArrayList<>(applicationListeners);
    }
}
