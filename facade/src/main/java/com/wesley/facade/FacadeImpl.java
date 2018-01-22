package com.wesley.facade;

import com.wesley.facade.sub.Sub1;
import com.wesley.facade.sub.Sub2;
import com.wesley.facade.sub.Sub3;

/**
 * @author Created by Wesley on 2018/1/22.
 */
public class FacadeImpl implements Facade {

    private Sub1 sub1;

    private Sub2 sub2;

    private Sub3 sub3;

    public FacadeImpl(Sub1 sub1, Sub2 sub2, Sub3 sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public void funtion13() {
        this.sub1.function1();
        this.sub3.function3();
    }

    @Override
    public void function123() {
        this.sub1.function1();
        this.sub2.function2();
        this.sub3.function3();
    }
}
