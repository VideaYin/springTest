package com.imooc.aop.learn;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/8.
 */
public class MoocAspect {

    public void beforeDo(){
        System.out.println("MoocAspect before");
    }

    public void afterDo(){
        System.out.println("MoocAspect AfterDo");
    }
}
