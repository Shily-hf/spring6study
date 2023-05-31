package edu.shily.spring6.iocxml;

import edu.shily.spring6.iocxml.ditest.Dept;
import edu.shily.spring6.iocxml.ditest.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class DeptTest {

    @Test
    public void testDept(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
    }
}
