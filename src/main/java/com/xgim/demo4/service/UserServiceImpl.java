package com.xgim.demo4.service;

import com.xgim.demo4.model.User;
import com.xgim.demo4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Iterable<User> findAll() {
        return repository.findAll();
    }
}
