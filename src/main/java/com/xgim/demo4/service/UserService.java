package com.xgim.demo4.service;

import com.xgim.demo4.model.User;

public interface UserService {

    void save(User user);

    User findByUserName(String username);

    Iterable<User> findAll();

}
