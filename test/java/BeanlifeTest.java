import com.sx.f2spring.service.Beanlife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC生命周期测试
 */
public class BeanlifeTest {

    @Test
    public void Test(){
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        Beanlife beanlife = (Beanlife) ioc.getBean("beanlife");
        System.out.println("bean可以使用了");
        System.out.println(beanlife.getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程睡眠出现异常,请重试");
        }

        //关闭IOC容器,使用 ApplicationContext的子方法ConfigurableApplicationContext中可以关闭IOC
        ConfigurableApplicationContext coc = (ConfigurableApplicationContext) ioc;
        coc.close();
    }
}
