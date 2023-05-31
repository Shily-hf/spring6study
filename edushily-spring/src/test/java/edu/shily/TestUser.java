package edu.shily;

import edu.shily.bean.AnnotationApplicationContext;
import edu.shily.service.UserService;

/**
 * @author Shily-zhang
 * @Description
 */
public class TestUser {

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("edu.shily");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
