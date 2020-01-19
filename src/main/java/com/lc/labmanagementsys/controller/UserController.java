package com.lc.labmanagementsys.controller;

import com.lc.labmanagementsys.common.JsonResult;
import com.lc.labmanagementsys.pojo.User;
import com.lc.labmanagementsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getCount")
    public String hello(String name, Model model){
        System.out.println(userService.getRowCount());
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/getUsers")
    public JsonResult getUsers(){
        JsonResult result = new JsonResult("测试成功");
        List<User> userList = new ArrayList<>();
        userList.add(new User("suojinxin8","suojinxing",2));
        userList.add(new User("suojinxing7","suojinxing",2));
        userList.add(new User("suojinxingw","suojinxing",2));
        userList.add(new User("suojinxing6","suojinxing",2));
        userList.add(new User("suojinxing5","suojinxing",2));
        userList.add(new User("suojinxing4","suojinxing",2));
        userList.add(new User("suojinxing3","suojinxing",2));
        userList.add(new User("suojinxing2","suojinxing",2));
        result.setData(userList);
        return result;
    }
}
