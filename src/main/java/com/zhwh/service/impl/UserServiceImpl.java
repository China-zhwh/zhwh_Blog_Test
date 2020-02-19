package com.zhwh.service.impl;

import com.zhwh.po.User;
import com.zhwh.repository.UserRepository;
import com.zhwh.service.UserService;
import com.zhwh.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
    }
}