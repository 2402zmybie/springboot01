package com.hr.springboot01.service;

import com.hr.springboot01.mapper.UserMapper;
import com.hr.springboot01.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //新增的时候加入事务, springBoot中直接在方法上加入注解  @Transactional即可
    @Transactional
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Transactional
    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
