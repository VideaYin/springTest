package com.imooc.IoC.learn.IoCExam.car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/10.
 */
public class Preson {

    private Car car;

    public Preson(Car car){
        this.car = car;
    }

    public void goHome(){
        Audi audi = new Audi();
        audi.start();
        audi.turnLeft();
        audi.turnRight();
        audi.stop();

    }
}
