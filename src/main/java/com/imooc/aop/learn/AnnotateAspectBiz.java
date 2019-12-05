package com.imooc.aop.learn;


import org.springframework.stereotype.Component;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/15.
 */
@Component
public class AnnotateAspectBiz {

    public void before(){
        System.out.println("before-------");
    }

    public void after(){
        System.out.println("---------after");
    }

}
