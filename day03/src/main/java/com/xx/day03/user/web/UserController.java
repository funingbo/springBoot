package com.xx.day03.user.web;

import com.xx.day03.test.entity.Test;
import com.xx.day03.user.entity.User;
import com.xx.day03.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public User hello(){
        User user= userService.test("测试User信息！");
        return user;
    }
}
