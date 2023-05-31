package edu.shily.service.impl;

import edu.shily.anno.Bean;
import edu.shily.anno.Di;
import edu.shily.dao.UserDao;
import edu.shily.service.UserService;

/**
 * @author Shily-zhang
 * @Description
 */

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service......");
        //调用Dao层方法
        userDao.add();
    }
}
