package edu.shily.spring6.iocxml;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class JDBCTest {

    @Test
    public void testJDBC(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidAbstractDataSource druidDataSource = context.getBean(DruidAbstractDataSource.class);
        System.out.println(druidDataSource.getUrl());
    }
}
