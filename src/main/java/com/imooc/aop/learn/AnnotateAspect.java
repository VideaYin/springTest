package com.imooc.aop.learn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/8.
 */
@Component
@Aspect
public class AnnotateAspect {

    @Before("execution(* com.imooc.aop.learn.Annotate*Biz.before(..))")
    public void before(){
        System.out.println("AnnotateAspect");
    }

    @Before("execution(* com.imooc.aop.learn.Annotate*Biz.after(..))")
    public void after(){
        System.out.println("AnnotateAspect");
    }
}
