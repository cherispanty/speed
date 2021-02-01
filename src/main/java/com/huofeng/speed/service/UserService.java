package com.huofeng.speed.service;

import com.huofeng.speed.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author linchong
 * @date 2021/2/1 14:36
 */
public interface UserService {
    User findByName(String name);

    int insert(String name, Integer age);
}
