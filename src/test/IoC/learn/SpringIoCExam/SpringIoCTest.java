package IoC.learn.SpringIoCExam;

import com.imooc.IoC.learn.SpringIoCExam.Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class SpringIoCTest {

    @Test
    public void springIoCTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-injectBean.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean="+bean);
    }
}
