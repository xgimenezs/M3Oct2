package com.xgim.demo4.controller;

import com.xgim.demo4.model.User;
import com.xgim.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<User>  getUsers(String name) {
        return userService.findAll();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public User getByUsername(@PathVariable("name") String name) {
        return userService.findByUserName(name);
    }
}
