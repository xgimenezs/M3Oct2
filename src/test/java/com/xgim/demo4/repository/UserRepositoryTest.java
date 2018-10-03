package com.xgim.demo4.repository;

import com.xgim.demo4.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUserTest() {
        userRepository.save(new User("Xavier", "mypwd", 43));
        userRepository.save(new User("Jordi", "mypwd", 39));
        userRepository.save(new User("Ruben", "pwd", 25));

        User xavi = userRepository.findByUsername("Xavier");
        Assert.assertNotNull(xavi);
        Assert.assertEquals(43, xavi.getAge());

        List<User> userList = userRepository.findByAgeGreaterThanOrderByUsername(30);
        Assert.assertNotNull(userList);
        assertEquals(2, userList.size());
        assertEquals("Jordi", userList.get(0).getUsername());


    }
}