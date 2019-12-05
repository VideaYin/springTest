package IoC.learn.SpringIoCExam;

import com.imooc.IoC.learn.SpringIoCExam.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class SpringTest001 {

    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-injectBean.xml");

        //通过构造方法实例化bean
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println("bean1="+bean1);

        //通过静态方法实例化bean
        Bean2 bean2 = null;
//        bean2 = Bean2Factory.getBean2();
        bean2 = context.getBean("bean2",Bean2.class);

        System.out.println("bean2="+bean2);

        //通过实例方法实例化bean
        Bean3 bean3 = null;
//        Bean3Factory bean3Factory = new Bean3Factory();
//        bean3 = bean3Factory.getBean3();
        bean3 = context.getBean("bean3",Bean3.class);

        System.out.println("bean3="+bean3);
    }
}
