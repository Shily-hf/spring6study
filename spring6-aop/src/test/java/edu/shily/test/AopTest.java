package edu.shily.test;


import edu.shily.xmlaop.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class AopTest {

    @Test
    public void testAdd() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        // calculator.add(1,2);
        calculator.div(2,2);
    }
}
