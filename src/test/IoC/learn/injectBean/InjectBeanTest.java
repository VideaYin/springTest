package IoC.learn.injectBean;

import com.imooc.IoC.learn.injectBean.AnotherBean;
import com.imooc.IoC.learn.injectBean.Bean;
import com.imooc.IoC.learn.injectBean.annotate.AnnotateBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class InjectBeanTest {

    /**
     * xml配置的方式实现依赖注入
     */
    @Test
    public void injectBeanOfXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-injectBean.xml");
        Bean bean = context.getBean("beanA",Bean.class);
        System.out.println("bean="+bean);
//        System.out.println("bean.getStringList="+bean.getStringList());
//        System.out.println("bean.getAnotherBeanList="+bean.getAnotherBeanList());
//        System.out.println("bean.getStringMap="+bean.getStringMap());
//        System.out.println("bean.getAnotherBeanMap="+bean.getAnotherBeanMap());
//        System.out.println("bean.getStringSet="+bean.getStringSet());
//        System.out.println("bean.getAnotherBeanSet="+bean.getAnotherBeanSet());
//        System.out.println("bean.getProperties="+bean.getProperties());
        AnotherBean bean1 = context.getBean("anotherBean",AnotherBean.class);
        bean1.setId(1);
        bean1.setAdd("jiangsushengnanjingshi");
        System.out.println("bean="+bean1);

    }

    /**
     * 注解实现实现依赖注入
     */
//    @Test
    public void injectBeanOfAnnotate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AnnotateBean bean = context.getBean(AnnotateBean.class);
        bean.setAdd("jiangsushengnanjignshi");
        bean.setId(1);

        System.out.println(bean.getAdd()+"---"+bean.getId());
    }

}
