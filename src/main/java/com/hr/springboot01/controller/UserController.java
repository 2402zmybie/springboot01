package com.hr.springboot01.controller;

import com.hr.springboot01.pojo.User;
import com.hr.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }

    @GetMapping("/insertUser")
    public void insertUser() {
        User user = new User();
        user.setUserName("liuyan");
        user.setPassword("123456");
        user.setName("柳岩");
        user.setAge(21);
        user.setSex(2);
        user.setBirthday(new Date());
        user.setCreated(new Date());
        user.setUpdated(new Date());
        user.setNote(null);
        userService.insertUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }

}
