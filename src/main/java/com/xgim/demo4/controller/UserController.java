package com.xgim.demo4.controller;

import com.xgim.demo4.model.User;
import com.xgim.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute("userForm", new User());

        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String saveUser(@Valid @ModelAttribute("userForm") User userForm) {
        userService.save(userForm);
        return "users";
    }

}
