package cn.itcast.property;

/**
 * Created by hjt on 2018/7/3.
 */
public class Person {

    // 1.定义一个属性
    private String username;

    // 2.生成这个属性的set方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void testperson() {
        System.out.println("person.............." + username);
    }

}
