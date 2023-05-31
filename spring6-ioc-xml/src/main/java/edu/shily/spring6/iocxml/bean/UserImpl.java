package edu.shily.spring6.iocxml.bean;

/**
 * @author Shily-zhang
 * @Description
 */
public class UserImpl implements UserDao{


    @Override
    public void run() {
        System.out.println("user run .................");
    }
}
