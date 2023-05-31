package edu.shily.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Shily-zhang
 * @Description
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
