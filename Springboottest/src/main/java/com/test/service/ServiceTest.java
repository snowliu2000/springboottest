package com.test.service;

import com.test.entity.User;

import java.util.List;

public interface ServiceTest {
    List<User> findAll();

    List<User> findById(String term_id);
}
