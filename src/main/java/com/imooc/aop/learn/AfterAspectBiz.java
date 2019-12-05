package com.imooc.aop.learn;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/8.
 */
public class AfterAspectBiz {

    private Integer id;

    private String name;

    public void afterDoBiz(){
        System.out.println("AfterAspectBiz biz");
    }

}
