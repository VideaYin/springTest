package com.imooc.IoC.learn.IoCExam.humen;

import com.imooc.IoC.learn.IoCExam.car.Car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class Zhangsan extends HumenWithCar{

    public Zhangsan(Car car){
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}
