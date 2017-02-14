package com.wesley.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者设计模式 - 主题实现者
 * @author Created by Wesley on 2017/2/13.
 */
public abstract class BathingPlace implements Subject {
    private final List<Observer> observers;
    private List<technician> technicians;

    public BathingPlace() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(this::notify);
    }

    public void addTechnician(technician technician){
        technicians.add(technician);
        notifyObservers();
    }

    private void notify(Observer observer){
        observer.update(encryptList(technicians));
    }

    abstract String encryptList(List<technician> technicians);

    class technician {

    }

}
