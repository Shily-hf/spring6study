package edu.shily.spring6.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Shily-zhang
 * @Description
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void addUserDao(){
        System.out.println("dao....");
    }
}
