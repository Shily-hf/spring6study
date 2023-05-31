package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.scope.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class ScopeTest {

    @Test
    public void testScope(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("order = " + order);
        Order order1 = context.getBean("order", Order.class);
        System.out.println("order1 = " + order1);
    }
}
