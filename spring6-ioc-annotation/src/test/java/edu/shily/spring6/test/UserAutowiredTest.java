package edu.shily.spring6.test;

import edu.shily.spring6.annotation.SpringConfig;
import edu.shily.spring6.controler.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class UserAutowiredTest {

    @Test
    public void testUserAutowired(){
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller = context.getBean(UserController.class);
        controller.addUser();
    }
}
