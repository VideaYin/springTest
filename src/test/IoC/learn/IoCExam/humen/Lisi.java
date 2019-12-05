package IoC.learn.IoCExam.humen;

import com.imooc.IoC.learn.IoCExam.car.Car;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class Lisi extends com.imooc.IoC.learn.IoCExam.humen.HumenWithCar {

    public Lisi(Car car){
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.stop();
    }
}
