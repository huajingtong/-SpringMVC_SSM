package cn.itcast.service;

import cn.itcast.dao.UserDao;

/**
 * Created by hjt on 2018/7/3.
 */
public class UserService {

    // 1.让dao作为service的一个属性
    private UserDao userDao;

    // 2.生成dao属性的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add() {
        System.out.println("service.........");
        // 原始方式，调用dao
        UserDao dao = new UserDao();
        dao.add();
    }

}
