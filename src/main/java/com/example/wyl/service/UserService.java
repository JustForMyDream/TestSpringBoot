package com.example.wyl.service;

import com.example.wyl.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
