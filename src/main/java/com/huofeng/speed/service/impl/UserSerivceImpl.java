package com.huofeng.speed.service.impl;

import com.huofeng.speed.entity.User;
import com.huofeng.speed.mapper.UserMapper;
import com.huofeng.speed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linchong
 * @date 2021/2/1 14:37
 */
@Service
public class UserSerivceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public int insert(String name, Integer age) {
        return userMapper.insert(name,age);
    }
}
