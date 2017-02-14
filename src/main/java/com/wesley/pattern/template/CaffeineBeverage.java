package com.wesley.pattern.template;

/**
 * 模板类
 * 提神饮料
 * @author Created by Wesley on 2016/9/11.
 */
public abstract class CaffeineBeverage {

    /**
     * 在抽象类中，将算法逻辑以方法的形式体现，声明一些抽象方法给子类实现具体的逻辑，用钩子方法给予子类的灵活性
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        /**
         * 钩子函数
         */
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    /**
     * 是否需要加点调味品
     * @return
     */
    boolean customerWantsCondiments(){
        return true;
    }

    /**
     * 烧水
     */
    protected abstract void boilWater();

    /**
     * 冲泡
     */
    protected abstract void brew();

    /**
     * 倒进杯子
     */
    protected abstract void pourInCup();

    /**
     * 加点调味品
     */
    protected abstract void addCondiments();
}
