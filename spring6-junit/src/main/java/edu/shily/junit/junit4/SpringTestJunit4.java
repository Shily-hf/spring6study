package edu.shily.junit.junit4;

import edu.shily.junit.junit5.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Shily-zhang
 * @Description
 */
// @RunWith(SpringJunit4ClassRunner.class)
// @ContextConfiguration(classpath:bean.xml)
public class SpringTestJunit4 {
    @Autowired
    private User user;

    @Test
    public void testUser4(){
        System.out.println(user);
        user.run();
    }
}
