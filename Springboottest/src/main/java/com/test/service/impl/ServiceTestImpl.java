package com.test.service.impl;

import com.test.dao.UserMapper;
import com.test.entity.User;
import com.test.service.ServiceTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ServiceTestImpl implements ServiceTest{
@Resource
public UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAllUser();
    }

    @Override
    public List<User> findById(String term_id) {
        return userMapper.findById(term_id);
    }
}
