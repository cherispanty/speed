package com.huofeng.speed.controller;

import com.huofeng.speed.entity.User;
import com.huofeng.speed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linchong
 * @date 2021/2/1 14:38
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/findByName/{name}")
    @ResponseBody
    public User findByName(@PathVariable("name") String name){
        return userService.findByName(name);
    }
}
