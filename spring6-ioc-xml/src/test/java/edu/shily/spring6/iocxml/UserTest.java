package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.bean.UserDao;
import edu.shily.spring6.iocxml.life.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserTest {

    @Test
    public void testUserObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取bean
        User user1 = (User) context.getBean("user");
        System.out.println("1 根据id获取bean"+user1);

        //根据类型获取bean,使用此方法获取bean时，xml文件中的类型有且只有一个
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean" + user2);

        //根据id和类型获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和类型获取bean" + user3);
    }

    @Test
    public void testDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("userDao = " + userDao);
        userDao.run();
    }

}