package com.xgim.demo4.repository;

import com.xgim.demo4.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);

    List<User> findByAgeGreaterThanOrderByUsername(int age);
}
