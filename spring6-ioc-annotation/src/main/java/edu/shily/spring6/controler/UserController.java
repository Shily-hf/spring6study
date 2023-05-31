package edu.shily.spring6.controler;

import edu.shily.spring6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Shily-zhang
 * @Description
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void addUser(){
        System.out.println("controller....");
        userService.addUserService();
    }
}
