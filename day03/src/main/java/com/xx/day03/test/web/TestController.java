package com.xx.day03.test.web;

import com.xx.day03.test.entity.Test;
import com.xx.day03.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Test hello(){
        Test test= testService.test("测试信息！");
        return test;
    }
}
