package com.imooc.aop.learn;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/8.
 */
public class BeforeAspectBiz {

    private Integer id;

    private String name;

    public void beforeDoBiz(){
        System.out.println("BeforeAspectBiz biz");
    }

}
