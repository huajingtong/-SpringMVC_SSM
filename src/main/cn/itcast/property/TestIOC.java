package cn.itcast.property;

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
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Book book = (Book) context.getBean("book");
        book.testBook();

        Person person = (Person)context.getBean("person");
        person.testperson();
    }
}