package edu.shily.spring6.service;

import edu.shily.spring6.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shily-zhang
 * @Description
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void addUserService(){
        System.out.println("service.....");
        userDao.addUserDao();
    }
}
