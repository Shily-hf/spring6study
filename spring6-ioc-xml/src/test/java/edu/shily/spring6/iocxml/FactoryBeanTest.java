package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.factorybean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factory.xml");
        User user = context.getBean("user", User.class);
        System.out.println("user = " + user);
    }
}
