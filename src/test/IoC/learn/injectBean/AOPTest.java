package IoC.learn.injectBean;

import com.imooc.aop.learn.AfterAspectBiz;
import com.imooc.aop.learn.AnnotateAspectBiz;
import com.imooc.aop.learn.AspectBiz;
import com.imooc.aop.learn.BeforeAspectBiz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:切面测试
 * <p>
 * Created by YinQZ on 2019/11/8.
 */
public class AOPTest {

    /**
     * 前置通知切面测试
     */
    @Test
    public void beforeMessageAOPTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        BeforeAspectBiz aspectBiz = context.getBean("beforeAspectBiz",BeforeAspectBiz.class);
        aspectBiz.beforeDoBiz();
    }

    /**
     * 后置通知切面测试
     */
    @Test
    public void afterMessageAOPTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AfterAspectBiz aspectBiz = context.getBean("afterAspectBiz",AfterAspectBiz.class);
        aspectBiz.afterDoBiz();
    }

    /**
     * 注解前置通知
     */
    @Test
    public void annotateBeforeAOPTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AnnotateAspectBiz aspectBiz = context.getBean("annotateAspectBiz",AnnotateAspectBiz.class);
        aspectBiz.before();
    }

    /**
     * 注解后置通知
     */
    @Test
    public void annotateAfterAOPTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AnnotateAspectBiz aspectBiz = context.getBean("annotateAspectBiz",AnnotateAspectBiz.class);
        aspectBiz.after();
    }

}
