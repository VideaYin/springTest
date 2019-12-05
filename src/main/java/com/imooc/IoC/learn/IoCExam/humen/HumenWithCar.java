package com.imooc.IoC.learn.IoCExam.humen;

import com.imooc.IoC.learn.IoCExam.car.Car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/10.
 */
public abstract class HumenWithCar implements Humen {

    protected Car car;

    public HumenWithCar(Car car){
        this.car = car;
    }

    public abstract void goHome();

}
