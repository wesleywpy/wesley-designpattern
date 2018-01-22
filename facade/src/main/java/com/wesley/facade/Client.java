package com.wesley.facade;

import com.wesley.facade.sub.Sub1;
import com.wesley.facade.sub.Sub1Impl;
import com.wesley.facade.sub.Sub2;
import com.wesley.facade.sub.Sub2Impl;
import com.wesley.facade.sub.Sub3;
import com.wesley.facade.sub.Sub3Impl;

/**
 * @author Created by Wesley on 2018/1/22.
 */
public class Client {

    public static void main(String[] args){
        Sub1 sub1 = new Sub1Impl();
        Sub2 sub2 = new Sub2Impl();
        Sub3 sub3 = new Sub3Impl();
        Facade facade = new FacadeImpl(sub1, sub2, sub3);
        facade.function123();
        facade.funtion13();
    }
}
