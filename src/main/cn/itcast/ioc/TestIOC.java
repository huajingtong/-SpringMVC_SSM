package cn.itcast.ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hjt on 2018/7/2.
 */
public class TestIOC {
    // 得到配置的user对象
    @Test
    public void demo1() {
        // 1.加载Spring配置文件，把配置文件中的对象进行创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        // classpath：类路径，src目录下的文件最终要编译到类路径下
        // 2.根据配置文件的id得到user对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
