package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.life.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class LifeTest {

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 对象创建完成可以使用了");
        context.close();
    }
}
