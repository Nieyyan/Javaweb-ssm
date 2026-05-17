package com.woxueit.ssm.controller;

import com.woxueit.ssm.pojo.User;
import com.woxueit.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //只允许使用GET请求
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public Object findAll(){
        List<User> all = userService.findAll();
        return all;
    }

}
