package com.xx.day03.test.service.impl;

import com.xx.day03.test.dao.TestDao;
import com.xx.day03.test.entity.Test;
import com.xx.day03.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test test(String str){
        System.out.println(str);
        Test test = testDao.getName();
        test.setMsg(str);
        return test;
    }
}
