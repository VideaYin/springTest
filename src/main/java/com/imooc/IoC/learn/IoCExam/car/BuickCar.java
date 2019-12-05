package com.imooc.IoC.learn.IoCExam.car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/10.
 */
public class BuickCar implements Car{

    public void start(){
        System.out.println("Buick start!!!");
    }

    public void turnLeft(){
        System.out.println("Buick turnLeft!!!");
    }

    public void turnRight(){
        System.out.println("Buick turnRight!!!");
    }

    public void stop(){
        System.out.println("Buick stop!!!");
    }
}
