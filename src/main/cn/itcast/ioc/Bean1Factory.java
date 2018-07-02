package cn.itcast.ioc;

/**
 * Created by hjt on 2018/7/2.
 */
public class Bean1Factory {

    // 静态方法
    public static User getBean1() {
        return new User();
    }

}