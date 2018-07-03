package cn.itcast.bean;

import cn.itcast.ioc.User;

/**
 * Created by hjt on 2018/7/2.
 */
public class Bean1Factory {

    // 静态方法
    public static Bean1  getBean1() {
        return new Bean1 ();
    }

}