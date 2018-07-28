import com.sx.f2spring.service.IOC_HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC的第一个测试类
 *
 */
public class IOC_HelloWorldTest {

    @Test
    public void test() {

        //创建IOC容器对象,通过xml获取
        //xml默认在resources中,如果在其他目录要写出完整路径
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取helloWorld对象
        //getBean中传入的是applicationContext.xml中配置的bean的id
        IOC_HelloWorld ioCservice = (IOC_HelloWorld)ioc.getBean("helloWorld");

        //调用方法
        ioCservice.sayHello();

    }
}
