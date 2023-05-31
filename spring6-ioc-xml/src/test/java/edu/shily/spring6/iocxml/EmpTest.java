package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.ditest.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class EmpTest {

    @Test
    public void testDept(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
    }

}
