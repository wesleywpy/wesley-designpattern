package com.wesley.pattern.template;

/**
 * 模板类
 * 提神饮料
 * @author Created by Wesley on 2016/9/11.
 */
public abstract class CaffeineBeverage {

    /**
     * 模板方法
     * 在抽象类中，将算法逻辑以方法的形式体现，声明一些抽象方法给子类实现具体的逻辑，用钩子方法给予子类的灵活性
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
    }

    /**
     * 具体方法
     * 烧水
     */
    public void boilWater() {
        System.out.println(" ... 模板方法里自带方法, 不会发生改变.");
    }

    /**
     * 抽象方法, 子类必须实现
     * 冲泡
     */
    protected abstract void brew();

    /**
     * 钩子方法, 子类可以根据情况实现
     * 加点调味品
     */
    protected void addCondiments() {

    }
}
