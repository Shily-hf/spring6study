package edu.shily.dao.impl;

import edu.shily.anno.Bean;
import edu.shily.dao.UserDao;

/**
 * @author Shily-zhang
 * @Description
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
