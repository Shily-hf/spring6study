package edu.shily.spring6.iocxml.auto.controller;

import edu.shily.spring6.iocxml.auto.service.UserService;

/**
 * @author Shily-zhang
 * @Description
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller方法执行了。。。");
        userService.addUserService();
    }
}
