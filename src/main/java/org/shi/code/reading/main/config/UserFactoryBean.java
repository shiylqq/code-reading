package org.shi.code.reading.main.config;

import org.shi.code.reading.main.pojo.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUserName(userName != null ? userName : "sLiang");
        user.setId(1);

        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
