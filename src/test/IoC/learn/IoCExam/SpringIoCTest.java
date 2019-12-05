package IoC.learn.IoCExam;

import com.imooc.IoC.learn.IoCExam.IoCContainer;
import com.imooc.IoC.learn.IoCExam.car.AudiCar;
import com.imooc.IoC.learn.IoCExam.car.BuickCar;
import com.imooc.IoC.learn.IoCExam.humen.Humen;
import com.imooc.IoC.learn.IoCExam.humen.Lisi;
import com.imooc.IoC.learn.IoCExam.humen.Zhangsan;
import org.junit.Before;
import org.junit.Test;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class SpringIoCTest {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void before(){
        ioCContainer.setBeans(AudiCar.class,"audi");
        ioCContainer.setBeans(BuickCar.class,"buick");
        ioCContainer.setBeans(Zhangsan.class,"zhangsan","audi");
        ioCContainer.setBeans(Lisi.class,"lisi","buick");
    }

    @Test
    public void test(){
        Humen zhangsan = (Humen) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();

        Humen lisi = (Humen) ioCContainer.getBean("lisi");
        lisi.goHome();
    }
}
