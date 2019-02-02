package com.test.controller;

import com.test.entity.User;
import com.test.service.ServiceTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class Controllertest {

    @Resource
    private ServiceTest serviceTest;

    @RequestMapping("/findAll")
    public List<User> test(){
        return serviceTest.findAll();
    }
    @RequestMapping("/findById")
    public User findById(String term_id){
        return serviceTest.findById(term_id);
    }

}
