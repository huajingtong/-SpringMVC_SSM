package cn.itcast.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hjt on 2018/7/3.
 */
public class TestIOC {
    @Test
    public void demo1() {
        // 1.加载Spring配置文件，把配置文件中的对象进行创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.根据配置文件的id得到bean1对象
//        Bean1 bean1 = (Bean1) context.getBean("bean1");
//        System.out.println(bean1);
//        bean1.bean1();
//
        // 2.根据配置文件的id得到user对象
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println(bean2);
        bean2.bean2();
    }
}
