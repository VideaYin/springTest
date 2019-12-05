package IoC.learn.IoCExam.car;

import com.imooc.IoC.learn.IoCExam.car.Car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/10.
 */
public class Preson {

    private com.imooc.IoC.learn.IoCExam.car.Car car;

    public Preson(Car car){
        this.car = car;
    }

    public void goHome(){
        com.imooc.IoC.learn.IoCExam.car.Audi audi = new com.imooc.IoC.learn.IoCExam.car.Audi();
        audi.start();
        audi.turnLeft();
        audi.turnRight();
        audi.stop();

    }
}
