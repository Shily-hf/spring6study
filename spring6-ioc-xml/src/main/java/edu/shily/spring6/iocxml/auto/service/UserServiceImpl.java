package edu.shily.spring6.iocxml.auto.service;

import edu.shily.spring6.iocxml.auto.dao.UserDao;

/**
 * @author Shily-zhang
 * @Description
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService方法执行了。。。。");
        userDao.addUserDao();
    }
}
