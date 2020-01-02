package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getCount")
    public String hello(String name, Model model){
        System.out.println(userService.getRowCount());
        return "hello";
    }
}
